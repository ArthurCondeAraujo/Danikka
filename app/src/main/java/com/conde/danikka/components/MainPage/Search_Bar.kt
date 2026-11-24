
package com.conde.danikka.components.MainPage

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.ui.Modifier
import com.conde.danikka.constants.TextFieldShape
import kotlinx.coroutines.launch
import androidx.compose.ui.graphics.Color



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Search_1(
    items: List<String> = emptyList(),
    onSearch: (String) -> Unit = {}
) {



    // Estado do texto digitado
    val textFieldState = rememberTextFieldState()

    // Estado de expansão da barra
    val searchBarState = rememberSearchBarState()

    // Controle das animações
    val scope = rememberCoroutineScope()

    // Texto digitado
    val query = textFieldState.text.toString()

    // Resultados filtrados
    val filteredItems = items.filter {
        it.contains(query, ignoreCase = true)
    }

    // Campo de pesquisa reutilizado
    val inputField: @Composable () -> Unit = {
        SearchBarDefaults.InputField(
            textFieldState = textFieldState,
            searchBarState = searchBarState,

            onSearch = { searchText ->
                onSearch(searchText)
                scope.launch {
                    searchBarState.animateToCollapsed()
                }
            },

            placeholder = {
                Text("Pesquisar...")
            },

            colors = SearchBarDefaults.inputFieldColors(
                focusedTextColor = Color(0xFF8A6EC2),
                unfocusedTextColor = Color(0xFF8A6EC2),
                cursorColor = Color(0xFF8A6EC2),
                focusedPlaceholderColor = Color(0xFF8A6EC2),
                unfocusedPlaceholderColor = Color(0xFF8A6EC2)
            )
        )
    }

    // Barra de pesquisa fechada
    SearchBar(
        state = searchBarState,
        inputField = inputField,
        modifier = Modifier.fillMaxWidth(),
        shape = TextFieldShape,
        colors = SearchBarDefaults.colors(
            containerColor = Color(0xFF24173D),
            dividerColor = Color(0xFF422E6A)
        )
    )


    // Barra expandida
    ExpandedFullScreenSearchBar(
        state = searchBarState,
        inputField = inputField,
        modifier = Modifier.fillMaxWidth(),
        collapsedShape = TextFieldShape
    ) {

        LazyColumn(
            modifier = Modifier.fillMaxWidth()
        ) {

            items(filteredItems) { result ->

                ListItem(
                    headlineContent = {
                        Text(result)
                    },

                    modifier = Modifier.fillMaxWidth(),

                )
            }
        }
    }
}
