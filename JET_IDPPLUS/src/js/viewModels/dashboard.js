/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * dashboard module
 */
define(['knockout', 'ojs/ojbootstrap', 'ojs/ojpagingdataproviderview', 'ojs/ojarraydataprovider', 'ojs/ojknockout', 'ojs/ojtable', 'ojs/ojpagingcontrol', 'ojs/ojbutton', 'ojs/ojpopup', 'ojs/ojanimation', 'ojs/ojformlayout', 'ojs/ojinputtext', 'ojs/ojselectcombobox', 'ojs/ojmenu', 'ojs/ojoption'
], function (ko, Bootstrap, PagingDataProviderView, ArrayDataProvider, AnimationUtils) {
   /**
     * The view model for the main content view template
     */
    function dashboardContentViewModel() {
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
            { invoiceNo: "587674565", amount: '29.00 USD',supplier: 'Terry Ford', supplierSite: 'Terry Ford', validationStatus: "Incomplete", invoiceDate: '8/13/20',businessUnit: "Incomplete", creationDate: '8/13/20'},
            { invoiceNo: "8767654", amount: '339.00 USD',supplier: 'Fedex', supplierSite: 'Fedex', validationStatus: "Incomplete", invoiceDate: '8/13/20',businessUnit: "Incomplete", creationDate: '8/13/20'},
            { invoiceNo: "9877575", amount: '29.00 USD',supplier: 'Ballard', supplierSite: 'Ballard', validationStatus: "Incomplete", invoiceDate: '8/13/20',businessUnit: "Incomplete", creationDate: '8/13/20'},
            { invoiceNo: "34657587686", amount: '339.00 USD',supplier: 'Terry Ford', supplierSite: 'Terry Ford', validationStatus: "Incomplete", invoiceDate: '8/13/20',businessUnit: "Incomplete", creationDate: '8/13/20'},
            { invoiceNo: "989876875", amount: '29.00 USD',supplier: 'Fedex', supplierSite: 'Fedex', validationStatus: "Incomplete", invoiceDate: '8/13/20',businessUnit: "Incomplete", creationDate: '8/13/20'},
            { invoiceNo: "908234902", amount: '29.00 USD',supplier: 'Ballard', supplierSite: 'Ballard', validationStatus: "Incomplete", invoiceDate: '8/13/20',businessUnit: "Incomplete", creationDate: '8/13/20'},
            { invoiceNo: "98372498", amount: '339.00 USD',supplier: 'Terry Ford', supplierSite: 'Terry Ford', validationStatus: "Incomplete", invoiceDate: '8/13/20',businessUnit: "Incomplete", creationDate: '8/13/20'},
            { invoiceNo: "587674565", amount: '29.00 USD',supplier: 'Terry Ford', supplierSite: 'Terry Ford', validationStatus: "Incomplete", invoiceDate: '8/13/20',businessUnit: "Incomplete", creationDate: '8/13/20'},
            { invoiceNo: "8767654", amount: '339.00 USD',supplier: 'Fedex', supplierSite: 'Fedex', validationStatus: "Incomplete", invoiceDate: '8/13/20',businessUnit: "Incomplete", creationDate: '8/13/20'},
            { invoiceNo: "9877575", amount: '29.00 USD',supplier: 'Ballard', supplierSite: 'Ballard', validationStatus: "Incomplete", invoiceDate: '8/13/20',businessUnit: "Incomplete", creationDate: '8/13/20'},
            { invoiceNo: "587674565", amount: '29.00 USD',supplier: 'Terry Ford', supplierSite: 'Terry Ford', validationStatus: "Incomplete", invoiceDate: '8/13/20',businessUnit: "Incomplete", creationDate: '8/13/20'},
            { invoiceNo: "8767654", amount: '339.00 USD',supplier: 'Fedex', supplierSite: 'Fedex', validationStatus: "Incomplete", invoiceDate: '8/13/20',businessUnit: "Incomplete", creationDate: '8/13/20'},
            { invoiceNo: "9877575", amount: '29.00 USD',supplier: 'Ballard', supplierSite: 'Ballard', validationStatus: "Incomplete", invoiceDate: '8/13/20',businessUnit: "Incomplete", creationDate: '8/13/20'},
     ];
    
        this.pagingDataProvider = new PagingDataProviderView(new ArrayDataProvider(deptArray, { idAttribute: 'DepartmentId' }));
      }
    
    
    return dashboardContentViewModel;
});
