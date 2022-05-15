/**
 * @externs
 * @suppress {duplicate,checkTypes}
 */

/**
 * @const
 */
var dat = function () {};

/**
 * @constructor
 * @param {GUIParams=} option
 */
dat.GUI = function (option) {};

dat.GUI.toggleHide = function () {};

/**
 * @return {boolean}
 */
dat.GUI.hide = function () {};

/**
 * @return {Object}
 */
dat.GUI.instance = function () {};

/**
 * @param {dat.GUI} gui
 */
dat.GUI.prototype.onClick = function (gui) {};
/**
 * @type {HTMLDivElement}
 */
dat.GUI.prototype.domElement;


/**
 * @param {*} target
 * @param {string} propName
 * @param {*=} param3
 * @param {number=} param4
 * @return {dat.GUI.Controller}
 */
dat.GUI.prototype.add = function (target, propName, param3, param4) {};

/**
 * @typedef {{ h: number, s: number, v: number }}
 */
var HSV_to_RGB = function (h, s, v) {};

/**
 * @param {*} target
 * @param {string} propName
 * @param {number|boolean|Object|Array<number>|HSV_to_RGB=} param3
 * @param {number=} param4
 * @return {dat.GUI.Controller}
 */
dat.GUI.prototype.addColor = function (target, propName, param3) {};

/**
 * @param {Controller} controller
 */
dat.GUI.prototype.remove = function (controller) {};

dat.GUI.prototype.destroy = function () {};

dat.GUI.prototype.destroy = function () {};

/**
 * @param {string} propName
 * @param {string=} label
 * @return {dat.GUI}
 */
dat.GUI.prototype.addFolder = function (propName, label) {};

/**
 * @param {dat.GUI} value
 */
dat.GUI.prototype.removeFolder = function (value) {};

dat.GUI.prototype.open = function () {};
dat.GUI.prototype.close = function () {};

/**
 * @param {*} target
 * @param {Array<Object>=} additionalTargets
 */
dat.GUI.prototype.remember = function (target, additionalTargets) {};

/**
 * @return {dat.GUI}
 */
dat.GUI.prototype.getRoot = function () {};
/**
 * @return {dat.GUI}
 */
dat.GUI.prototype.getSaveObject = function() {};

dat.GUI.prototype.save = function(){};

/**
 * @param {string} presetName
 */
dat.GUI.prototype.saveAs = function(presetName){};
/**
 * @param {GUI=} gui
 */
dat.GUI.prototype.revert = function(gui){};
/**
 * @param {dat.GUI.Controller} gui
 */
dat.GUI.prototype.listen = function(controller){};

dat.GUI.prototype.updateDisplay = function(){};

// gui properties in dat/gui/GUI.js
/**
 * @const {dat.GUI}
 */
dat.GUI.prototype.parent;

/**
 * @const {boolean}
 */
dat.GUI.prototype.scrollable;

/**
 * @const {boolean}
 */
dat.GUI.prototype.autoPlace;

/**
 * @type {string}
 */
dat.GUI.prototype.preset;

/**
 * @type {number}
 */
dat.GUI.prototype.width;

/**
 * @type {string}
 */
dat.GUI.prototype.name;

/**
 * @type {boolean}
 */
dat.GUI.prototype.closed;

/**
 * @type {boolean}
 */
dat.GUI.prototype.selected;

/**
 * @const {Object}
 */
dat.GUI.prototype.load;

/**
 * @type {boolean}
 */
dat.GUI.prototype.useLocalStorage;

/**
 *
 * @typedef {{autoPlace:!boolean,scrollable:!boolean,closed:!boolean,closeOnTop:!boolean,load:!Object,name:!string,preset:!string,width:!number}}
 */
dat.GUI.GUIParams  = function () {};


/**
 * @constructor
 */
dat.GUI.Controller = function () {};


dat.GUI.Controller.prototype.destroy = function () {};

// Controller
/**
 * @param {?} value
 */
dat.GUI.Controller.prototype.onChange = function (value){};

/**
 * @param {?} value
 */
dat.GUI.Controller.prototype.onFinishChange = function (value){};

/**
 * @param {?} value
 * @return {dat.GUI.Controller}
 */
dat.GUI.Controller.prototype.setValue = function (value){};

/**
 * @return {Object}
 */
dat.GUI.Controller.prototype.getValue = function (){};

dat.GUI.Controller.prototype.updateDisplay = function (){};

/**
 * @return {boolean}
 */
dat.GUI.Controller.prototype.isModified = function (){};

/**
 * @param {number} n
 * @return {Controller}
 */
dat.GUI.Controller.prototype.min = function (){};

/**
 * @param {number} n
 * @return {Controller}
 */
dat.GUI.Controller.prototype.max = function (){};

/**
 * @param {number} n
 * @return {Controller}
 */
dat.GUI.Controller.prototype.step = function (){};

/**
 * @return {Controller}
 */
dat.GUI.Controller.prototype.fire = function (){};

/**
 * @param {Object} option
 * @return {Controller}
 */
dat.GUI.Controller.prototype.options = function (option){};

/**
 * @param {string} s
 * @return {Controller}
 */
dat.GUI.Controller.prototype.name = function (s){};

/**
 * @return {Controller}
 */
dat.GUI.Controller.prototype.listen = function (){};

/**
 * @return {Controller}
 */
dat.GUI.Controller.prototype.remove = function (){};




/**
 * @constructor
 * @extends {dat.controllers.Controller}
 */
dat.GUI.BooleanController = function (){};

/**
 * @constructor
 * @extends {dat.controllers.Controller}
 */
dat.GUI.OptionController = function (){};

/**
 * @constructor
 * @extends {dat.controllers.Controller}
 */
dat.GUI.StringController = function (){};

/**
 * @constructor
 * @extends {dat.controllers.Controller}
 */
dat.GUI.NumberController = function (){};

/**
 * @constructor
 * @extends {dat.controllers.Controller}
 */
dat.GUI.NumberControllerBox = function (){};

/**
 * @constructor
 * @extends {dat.controllers.Controller}
 */
dat.GUI.NumberControllerSlider = function (){};

/**
 * @constructor
 * @extends {dat.controllers.Controller}
 */
dat.GUI.FunctionController = function (){};

/**
 * @constructor
 * @extends {dat.controllers.Controller}
 */
dat.GUI.ColorController = function (){};


