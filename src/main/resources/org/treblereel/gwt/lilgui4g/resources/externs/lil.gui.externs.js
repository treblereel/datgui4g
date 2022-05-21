/**
 * @externs
 */

/**
 * @const
 */
var lil = function () {};

/**
 * @constructor
 * @param {*=} option
 */
lil.GUI = function (option) {};

/**
 * @param {*} target
 * @param {string} propName
 * @param {*=} param3
 * @param {number=} param4
 * @return {lil.GUI.BooleanController|lil.GUI.FunctionController|lil.GUI.NumberController|lil.GUI.StringController|lil.GUI.OptionController}
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
 * @return {lil.GUI.ColorController}
 */
lil.GUI.prototype.addColor = function (target, propName, param3,param4) {};

lil.GUI.prototype.destroy = function () {};

/**
 * @param {string} label
 * @return {lil.GUI}
 */
lil.GUI.prototype.addFolder = function ( label) {};

/**
 * @param {*} obj
 * @param {boolean=} recursive
 * @return {lil.GUI}
 */
lil.GUI.prototype.load = function (obj, recursive) {};

/**
 * @param {boolean=} open
 * @return {lil.GUI}
 */
lil.GUI.prototype.open = function (open) {};

/**
 * @return {lil.GUI}
 */
lil.GUI.prototype.close = function () {};

/**
 * @param {boolean=} recursive
 * @return {lil.GUI}
 */
lil.GUI.prototype.save = function(recursive){};

/**
 * @param {boolean=} recursive
 * @return {lil.GUI}
 */
lil.GUI.prototype.show = function(recursive){};

/**
 * @return {lil.GUI}
 */
lil.GUI.prototype.hide = function(){};

/**
 * @param {string} title
 * @return {lil.GUI}
 */
lil.GUI.prototype.title = function(title){};

/**
 * @param {boolean=} recursive
 * @return {lil.GUI}
 */
lil.GUI.prototype.reset = function(recursive){};

/**
 * @type {HTMLElement}
 */
lil.GUI.prototype.domElement;

/**
 * @const {lil.GUI}
 */
lil.GUI.prototype.parent;

/**
 * @type {boolean}
 */
lil.GUI.prototype._closed;

/**
 * @type {lil.GUI}
 */
lil.GUI.prototype.root;

/**
 * @type {Array<lil.GUI>}
 */
lil.GUI.prototype.folders;

/**
 * @type {Array<lil.GUI.Controller>}
 */
lil.GUI.prototype.controllers;

/**
 *
 * @typedef {{autoPlace:!boolean,container:HTMLElement, width:!number, title: string, injectStyles: boolean, touchStyles:boolean, parent: lil.GUI}}
 */
lil.GUI.GUIParams  = function () {};


/**
 * @constructor
 */
lil.GUI.Controller = function () {};

/**
 * @type {boolean}
 */
lil.GUI.Controller.prototype._disabled;

/**
 * @type {HTMLElement}
 */
lil.GUI.Controller.prototype.domElement;

/**
 * @type {*}
 */
lil.GUI.Controller.prototype.object;

/**
 * @type {string}
 */
lil.GUI.Controller.prototype.property;


// Controller
/**
 * @param {string} s
 * @return {lil.GUI.Controller}
 */
lil.GUI.Controller.prototype.name = function (s){};

/**
 * @param {?} value
 */
lil.GUI.Controller.prototype.onChange = function (value){};

/**
 * @param {?} value
 */
lil.GUI.Controller.prototype.onFinishChange = function (value){};

/**
 * @return {lil.GUI.Controller}
 */
lil.GUI.Controller.prototype.reset = function (){};

/**
 * @param {boolean=} enable
 * @return {lil.GUI.Controller}
 */
lil.GUI.Controller.prototype.enable = function (enable){};

/**
 * @param {boolean=} disable
 * @return {lil.GUI.Controller}
 */
lil.GUI.Controller.prototype.disable = function (disable){};

/**
 * @param {Object} option
 * @return {lil.GUI.Controller}
 */
lil.GUI.Controller.prototype.options = function (option){};

/**
 * @param {Number} n
 * @return {lil.GUI.Controller}
 */
lil.GUI.Controller.prototype.min = function (n){};

/**
 * @param {Number} n
 * @return {lil.GUI.Controller}
 */
lil.GUI.Controller.prototype.max = function (n){};

/**
 * @param {Number} n
 * @return {lil.GUI.Controller}
 */
lil.GUI.Controller.prototype.step = function (n){};

/**
 * @param {boolean=} listen
 * @return {lil.GUI.Controller}
 */
lil.GUI.Controller.prototype.listen = function (listen){};

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

lil.GUI.Controller.prototype.destroy = function () {};

/**
 * @constructor
 * @extends {lil.GUI.Controller}
 */
lil.GUI.BooleanController = function (){};

/**
 * @constructor
 * @extends {lil.GUI.Controller}
 */
lil.GUI.OptionController = function (){};

/**
 * @constructor
 * @extends {lil.GUI.Controller}
 */
lil.GUI.StringController = function (){};

/**
 * @constructor
 * @extends {lil.GUI.Controller}
 */
lil.GUI.NumberController = function (){};

/**
 * @constructor
 * @extends {lil.GUI.Controller}
 */
lil.GUI.FunctionController = function (){};

/**
 * @constructor
 * @extends {lil.GUI.Controller}
 */
lil.GUI.ColorController = function (){};


