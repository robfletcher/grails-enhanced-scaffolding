# Enhanced scaffolding plugin

This plugin adds a number of JavaScript enhancements to core Grails scaffolding. The enhancements can be loaded by adding

	<r:require module="scaffolding"/>

to a page or layout. If the [_resources_ plugin][1] is not being used then individual JavaScript and CSS files need to be included.

The current set of enhancements is:

### grails.ajaxloader

Displays a _"Loading"_ indicator when there are active AJAX requests pending.

### grails.alerts

Enhances Grails' flash and error messages to display as dismissible message overlays at the top of the page.

### grails.autocomplete

Uses the [jQuery-UI autocomplete control][2] to replace `select` elements used for many-to-many and one-to-many relationships. _Note:_ jQuery-UI is an optional dependency of this plugin so this enhancement will not do anything if jQuery-UI is not found in the page.

### grails.errors

Replaces field-specific error messages at the top of the form with tooltips next to the individual fields that are only displayed when the field is focused.

### grails.forms

Minor form enhancements including ensuring the first field (or first field with an error) is focused.

### grails.fouc

Attempts to avoid a _"Flash of unstyled content"_ by only displaying the document body once it has finished loading.

### grails.list

AJAX-enhances scaffolding list pages so that pagination and sorting are done via AJAX instead of reloading the entire page. _Note:_ in order that bookmarking, deep-linking and history navigation (the back and forward buttons) continue to work this enhancement will only load on browsers that support the [history API][3].

### grails.range

Replaces `select` elements used to represent domain class properties that have a [_range_][4] constraint with native HTML _range_ inputs in browsers that support them.

## Included libraries

The enhanced scaffolding plugin depends on the following software:

* The [jQuery.tipsy][http://onehackoranother.com/projects/jquery/tipsy] plugin.
* The [pjax][5] library.

## To-do

### General

* Get rid of the _*.loader.js_ scripts as they are only necessary for _qunit_. Possibly use a config driven loader to allow apps to easily disable unwanted enhancements.
* Move autofocus enhancement to Grails core.

### Improvements

* _grails.range_ should use a jQuery-UI slider in browsers that do not support `input type="range"` if jQuery-UI is available.

### New enhancements

* In-place editing of related entities using a modal popup of the relevant _create_ or _edit_ form.

[1]:http://grails.org/plugin/resources
[2]:http://jqueryui.com/demos/autocomplete/
[3]:http://diveintohtml5.org/history.html
[4]:http://grails.org/doc/latest/ref/Constraints/range.html
[5]:http://pjax.heroku.com/