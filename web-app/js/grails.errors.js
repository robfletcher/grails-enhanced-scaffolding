(function($) {
	/**
	 * Turns field-specific errors into tooltips shown on focus.
	 */
	$.fn.grailsErrorTooltips = function(options) {
		// settings that can be overridden with arguments
		var settings = {
			hide: true // if true, hides the tooltips until the corresponding input is focused
		};
		if (options) {
			$.extend(settings, options);
		}
		
		var container = $(this).parent();

		this.each(function() {
			// grab the error message and its input
			var errorMessage = $(this).text();
			var fieldId = $(this).data('field-id');
			var input = $('#' + fieldId);

			if (input.size() == 1) {
				// remove the original error message from the DOM
				$(this).remove();

				// create a tooltip adjacent to the input
				input.tipsy({
					fade: true,
					gravity: 'w',
					title: function() { return errorMessage },
					trigger: 'focus'
				});
			}
		});
			
		// if all error messages have been turned into tooltips remove the message container
		if (container.has(this).size() == 0) {
			container.remove();
		}
		
		return this;
	};
})(jQuery);