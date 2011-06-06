(function($) {
	// if the browser supports range inputs use them instead of selects for range properties
	if (Modernizr.inputtypes.range) {
		$('select.range').grailsRange();
	} else if (jQuery.ui.slider != undefined) {
		$('select.range').each(function() {
			var select = $(this);
			var sliderDiv = $('<div/>').insertAfter(select);
			sliderDiv.slider({
				range: 'min',
				min: parseInt(select.attr('min')),
				max: parseInt(select.attr('max')),
				value: parseInt(select.val()),
				change: function(event, ui) {
					select.val('' + ui.value);
				}
			});
		});
	}
})(jQuery);