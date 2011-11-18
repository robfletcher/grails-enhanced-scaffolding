(function($) {
	/**
	 * AJAX-enables pagination and sorting controls in a table.
	 */
	$.fn.grailsList = function() {
		this.find('.pagination a, th.sortable a').pjax('#list-book', { timeout: 2000 });
		return this;
	};
})(jQuery);