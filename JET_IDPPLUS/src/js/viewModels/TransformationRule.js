/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * transformationRule module
 */
define(['knockout', 'ojs/ojbootstrap', 'ojs/ojpagingdataproviderview', 'ojs/ojarraydataprovider', 'ojs/ojknockout', 'ojs/ojtable', 'ojs/ojpagingcontrol', 'ojs/ojbutton', 'ojs/ojpopup', 'ojs/ojanimation', 'ojs/ojformlayout', 'ojs/ojinputtext', 'ojs/ojselectcombobox', 'ojs/ojmenu', 'ojs/ojoption'
], function (ko, Bootstrap, PagingDataProviderView, ArrayDataProvider, AnimationUtils) {
  /**
   * The view model for the main content view template
   */
 
    function transformationRuleContentViewModel() {
        this.selectedMenuItem = ko.observable('(None selected yet)');
        this.menuItemAction = function (event) {
        this.selectedMenuItem(event.target.value);
        }.bind(this);
    
        this.startAnimationListener = function (event) {
          var ui = event.detail;
          if (event.target.id !== 'popup1') { return; }
    
          if (ui.action === 'open') {
            event.preventDefault();
            var options = { direction: 'top' };
            // AnimationUtils.slideIn(ui.element, options).then(ui.endCallback);
          } else if (ui.action === 'close') {
            event.preventDefault();
            ui.endCallback();
          }
        };
    
        this.openListener = function () {
          var popup = document.getElementById('popup1');
          popup.open('#btnGo');
        };
    
        this.cancelListener = function () {
          var popup = document.getElementById('popup1');
          popup.close();
        };
    
        var deptArray = [
            {transformationRule:"Business Unit Oracle", targetSystem: "Oracle", fieldName: "Business Unit", IDPField:"BU_NAME", level:"Header",ruleQuery:"ORGANISATION from IDP_INVOICE_INTERFACE"},
            {transformationRule:"Vendor Name Oracle", targetSystem: "Oracle", fieldName: "Vendor Name", IDPField:"SUPPLIER_NAME", level:"Header",ruleQuery:"VENDOR from IDP_INVOICE_INTERFACE"},
            {transformationRule:"Vendor Site Oracle", targetSystem: "Oracle", fieldName: "Vendor Site", IDPField:"SUPPLIER_SITE", level:"Header",ruleQuery:"select SITE FROM IDP_INVOICE_INTERFACE"},
      
       ];
    
        this.pagingDataProvider = new PagingDataProviderView(new ArrayDataProvider(deptArray, { idAttribute: 'DepartmentId' }));
      }
    
    
    return transformationRuleContentViewModel;
});
