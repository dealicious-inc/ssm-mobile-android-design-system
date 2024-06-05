package net.deali.designsystem.sample.data.model

sealed class Screen(
    val route: String,
) {
    /** Sample app main screen */
    object Menu : Screen("menu")

    /** Token */
    object Typography : Screen("typography")
    object Colors : Screen("colors")
    object Indentations : Screen("indentations")
    object Shadows : Screen("shadows") //Elevation
    object CornerRadius : Screen("cornerRadius")
    object Icons : Screen("icons")


    /** Atoms */
    //Badge X
    object Buttons : Screen("buttons")
    object Chips : Screen("chips")
    object CheckBox : Screen("checkBox")
    object CheckCircle : Screen("checkCircle")
    object CheckLine : Screen("checkLine")
    object RadioButton : Screen("radioButton")
    object Switch : Screen("switch")
    object TextInput : Screen("textInput")
    object SearchInput : Screen("searchInput")
    object TextArea : Screen("textArea")
    object Dropdown : Screen("dropDown")
    object Indicator : Screen("indicator")
    object Rating : Screen("rating")
    object Tooltip : Screen("tooltip")
    object Tag : Screen("tag")
    object Divider : Screen("divider")

    /** Molecules */
    //TopBar
    object TopBar : Screen("topBar")
    object TabBar : Screen("tabBar")
    object SearchBar : Screen("searchBar")
    object FilterBar : Screen("filterBar")
    object ErrorCase : Screen("errorCase")
    object BottomSheet : Screen("bottomSheet")
    object DateTimePicker : Screen("dateTimePicker")
    object TextInputWithButton : Screen("textInputWithButton")
    object TextAreaButton : Screen("textAreaButton")
    object SearchInputWithTag : Screen("searchInputWithTag")
    object Popup : Screen("popup")
    object Slider : Screen("slider")

    /** Undefined */
    object SwipeRefresh : Screen("swipeRefresh")
}
