# TextSuggestion
Auto Complete Text suggestion for edittextview, example for single and multiple items suggestions

If you want to get suggestions , when you type in an editable text field , you can do this via AutoCompleteTextView.
It provides suggestions automatically when the user is typing. The list of suggestions is displayed in a drop down menu from which
the user can choose an item to replace the content of the edit box with.

# Method & description
getAdapter()
This method returns a filterable list adapter used for auto completion

# getCompletionHint()

This method returns optional hint text displayed at the bottom of the the matching list
# getDropDownAnchor()

This method returns returns the id for the view that the auto-complete drop down list is anchored to.

# getListSelection()

This method returns the position of the dropdown view selection, if there is one

# isPopupShowing()

This method indicates whether the popup menu is showing

# setText(CharSequence text, boolean filter)

This method sets text except that it can disable filtering

# showDropDown()

This method displays the drop down on screen.
