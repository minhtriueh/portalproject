
function hideshow() {

	var allHTMLTags = new Array();

	// Create Array of All HTML Tags
	var allHTMLTags = document.getElementsByTagName("*");

	// Loop through all tags using a for loop
	for (i = 0; i < allHTMLTags.length; i++) {

		// Get all tags with the specified class name.
		if (allHTMLTags[i].className == "revhistory") {

			// Make my stuff visible again
			if (allHTMLTags[i].style.display == "none") {
				allHTMLTags[i].style.display = "inline";
			} else {
				allHTMLTags[i].style.display = "none";
			}
		}

		// Get all tags with the specified class name.
		if (allHTMLTags[i].className == "twitter") {
			if (allHTMLTags[i].style.display == "none") {
				allHTMLTags[i].style.display = "inline";
			} else {
				allHTMLTags[i].style.display = "none";
			}
		}
	}

}
