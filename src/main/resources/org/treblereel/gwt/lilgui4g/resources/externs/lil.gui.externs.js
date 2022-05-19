/**
 * @externs
 * @suppress {duplicate,checkTypes}
 */

/**
 * @const
 */
var lil = function () {};

/**
 * @constructor
 * @param {GUIParams=} option
 */
lil.GUI = function (option) {};

lil.GUI.toggleHide = function () {};

/**
 * @return {boolean}
 */
lil.GUI.hide = function () {};

/**
 * @return {Object}
 */
lil.GUI.instance = function () {};

/**
 * @param {lil.GUI} gui
 */
lil.GUI.prototype.onClick = function (gui) {};
/**
 * @type {HTMLDivElement}
 */
lil.GUI.prototype.domElement;


/**
 * @param {*} target
 * @param {string} propName
 * @param {*=} param3
 * @param {number=} param4
 * @return {lil.GUI.Controller}
 */
lil.GUI.prototype.add = function (target, propName, param3, param4) {};

/**
 * @typedef {{ h: number, s: number, v: number }}
 */
var HSV_to_RGB = function (h, s, v) {};

/**
 * @param {*} target
 * @param {string} propName
 * @param {number|boolean|Object|Array<number>|HSV_to_RGB=} param3
 * @param {number=} param4
 * @return {lil.GUI.Controller}
 */
lil.GUI.prototype.addColor = function (target, propName, param3) {};

lil.GUI.prototype.destroy = function () {};

/**
 * @param {string} propName
 * @param {string=} label
 * @return {lil.GUI}
 */
lil.GUI.prototype.addFolder = function (propName, label) {};

lil.GUI.prototype.open = function () {};

lil.GUI.prototype.close = function () {};

/**
 * @param {*} target
 * @param {Array<Object>=} additionalTargets
 */
lil.GUI.prototype.remember = function (target, additionalTargets) {};

/**
 * @return {lil.GUI}
 */
lil.GUI.prototype.getRoot = function () {};
/**
 * @return {lil.GUI}
 */
lil.GUI.prototype.getSaveObject = function() {};

lil.GUI.prototype.save = function(){};

/**
 * @param {string} presetName
 */
lil.GUI.prototype.saveAs = function(presetName){};
/**
 * @param {GUI=} gui
 */
lil.GUI.prototype.revert = function(gui){};

lil.GUI.prototype.updateDisplay = function(){};

// gui properties in dat/gui/GUI.js
/**
 * @const {lil.GUI}
 */
lil.GUI.prototype.parent;

/**
 * @const {boolean}
 */
lil.GUI.prototype.scrollable;

/**
 * @const {boolean}
 */
lil.GUI.prototype.autoPlace;

/**
 * @type {string}
 */
lil.GUI.prototype.preset;

/**
 * @type {number}
 */
lil.GUI.prototype.width;

/**
 * @type {string}
 */
lil.GUI.prototype.name;

/**
 * @type {boolean}
 */
lil.GUI.prototype.closed;

/**
 * @type {boolean}
 */
lil.GUI.prototype.selected;

/**
 * @const {Object}
 */
lil.GUI.prototype.load;

/**
 * @type {boolean}
 */
lil.GUI.prototype.useLocalStorage;

/**
 *
 * @typedef {{autoPlace:!boolean,scrollable:!boolean,closed:!boolean,closeOnTop:!boolean,load:!Object,name:!string,preset:!string,width:!number}}
 */
lil.GUI.GUIParams  = function () {};


/**
 * @constructor
 */
lil.GUI.Controller = function () {};


lil.GUI.Controller.prototype.destroy = function () {};

// Controller
/**
 * @param {?} value
 */
lil.GUI.Controller.prototype.onChange = function (value){};

/**
 * @param {?} value
 */
lil.GUI.Controller.prototype.onFinishChange = function (value){};

/**
 * @param {?} value
 * @return {lil.GUI.Controller}
 */
lil.GUI.Controller.prototype.setValue = function (value){};

/**
 * @return {Object}
 */
lil.GUI.Controller.prototype.getValue = function (){};

lil.GUI.Controller.prototype.updateDisplay = function (){};

/**
 * @return {boolean}
 */
lil.GUI.Controller.prototype.isModified = function (){};

/**
 * @param {number} n
 * @return {Controller}
 */
lil.GUI.Controller.prototype.min = function (){};

/**
 * @param {number} n
 * @return {Controller}
 */
lil.GUI.Controller.prototype.max = function (){};

/**
 * @param {number} n
 * @return {Controller}
 */
lil.GUI.Controller.prototype.step = function (){};

/**
 * @return {Controller}
 */
lil.GUI.Controller.prototype.fire = function (){};

/**
 * @param {Object} option
 * @return {Controller}
 */
lil.GUI.Controller.prototype.options = function (option){};

/**
 * @param {string} s
 * @return {Controller}
 */
lil.GUI.Controller.prototype.name = function (s){};

/**
 * @param {boolean=} listen
 * @return {Controller}
 */
lil.GUI.Controller.prototype.listen = function (listen){};

/**
 * @return {Controller}
 */
lil.GUI.Controller.prototype.remove = function (){};

/**
 * @constructor
 * @extends {lil.controllers.Controller}
 */
lil.GUI.BooleanController = function (){};

/**
 * @constructor
 * @extends {lil.controllers.Controller}
 */
lil.GUI.OptionController = function (){};

/**
 * @constructor
 * @extends {lil.controllers.Controller}
 */
lil.GUI.StringController = function (){};

/**
 * @constructor
 * @extends {lil.controllers.Controller}
 */
lil.GUI.NumberController = function (){};

/**
 * @constructor
 * @extends {lil.controllers.Controller}
 */
lil.GUI.NumberControllerBox = function (){};

/**
 * @constructor
 * @extends {lil.controllers.Controller}
 */
lil.GUI.NumberControllerSlider = function (){};

/**
 * @constructor
 * @extends {lil.controllers.Controller}
 */
lil.GUI.FunctionController = function (){};

/**
 * @constructor
 * @extends {lil.controllers.Controller}
 */
lil.GUI.ColorController = function (){};


