package net.deali.designsystem.sample.data.model

sealed class Screen(
    val route: String,
) {
    /** Sample app main screen */
    data object Menu : Screen("menu")

    /** Token */
    data object Typography : Screen("typography")
    data object Colors : Screen("colors")
    data object Indentations : Screen("indentations")
    data object Shadows : Screen("shadows") //Elevation
    data object CornerRadius : Screen("cornerRadius")
    data object Icons : Screen("icons")


    /** Atoms */
    //Badge X
    data object Buttons : Screen("buttons")
    data object ButtonsRound : Screen("buttonsRound")
    data object Chips : Screen("chips")
    data object CheckBox : Screen("checkBox")
    data object CheckCircle : Screen("checkCircle")
    data object CheckLine : Screen("checkLine")
    data object RadioButton : Screen("radioButton")
    data object Switch : Screen("switch")
    data object TextInput : Screen("textInput")
    data object SearchInput : Screen("searchInput")
    data object TextArea : Screen("textArea")
    data object Dropdown : Screen("dropDown")
    data object Indicator : Screen("indicator")
    data object Rating : Screen("rating")
    data object Tooltip : Screen("tooltip")
    data object Tag : Screen("tag")
    data object Divider : Screen("divider")

    /** Molecules */
    //TopBar
    data object TopBar : Screen("topBar")
    data object TabBar : Screen("tabBar")
    data object SearchBar : Screen("searchBar")
    data object FilterBar : Screen("filterBar")
    data object ErrorCase : Screen("errorCase")
    data object BottomSheet : Screen("bottomSheet")
    data object DateTimePicker : Screen("dateTimePicker")
    data object TextInputWithButton : Screen("textInputWithButton")
    data object TextAreaButton : Screen("textAreaButton")
    data object SearchInputWithTag : Screen("searchInputWithTag")
    data object Alert : Screen("alert")
    data object Slider : Screen("slider")
    data object Accordion : Screen("accordion")
    data object Description : Screen("description")

    /** Undefined */
    data object SwipeRefresh : Screen("swipeRefresh")
}
