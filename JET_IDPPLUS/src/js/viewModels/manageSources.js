/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * manageSources module
 */
define(['ojs/ojcore', 'knockout', 'ojs/ojbootstrap', 'ojs/ojknockout', 'ojs/ojbutton', 'ojs/ojanimation', 'knockout', 'ojs/ojbootstrap', 'ojs/ojknockout', 'ojs/ojbutton',
'ojs/ojpopup','ojs/ojresponsiveutils', 'ojs/ojresponsiveknockoututils',
'ojs/ojmessaging', 'ojs/ojinputtext', 'ojs/ojlabel', 'ojs/ojformlayout'
], function (oj, ko, AnimationUtils,Bootstrap,ResponsiveUtils, ResponsiveKnockoutUtils, Message) {
    /**
     * The view model for the main content view template
     */
    function manageSourcesContentViewModel() {
        var self = this;

        // this.isSmall = ResponsiveKnockoutUtils.createMediaQueryObservable(
        //     ResponsiveUtils.getFrameworkQuery(ResponsiveUtils.FRAMEWORK_QUERY_KEY.SM_ONLY));
  
        //   this.isLarge = ResponsiveKnockoutUtils.createMediaQueryObservable(
        //     ResponsiveUtils.getFrameworkQuery(ResponsiveUtils.FRAMEWORK_QUERY_KEY.LG_ONLY));
  
          // For small screens: single column layout
          // For medium screens and up: two column layout
          // For large screens and up: three column layout
        //   this.cols = ko.computed(function () {
        //     if(this.isSmall())
        //       return 1;
        //     else if(this.isLarge())
        //       return 3;
        //     else
        //       return 2;
        //   }, this);
        
    
                  
        this.startAnimationListener = function (event) {
            var ui = event.detail;
            if (event.target.id !== 'popup1') { return; }
      
            if (ui.action === 'open') {
              event.preventDefault();
              var options = { direction: 'top' };
              AnimationUtils.slideIn(ui.element, options).then(ui.endCallback);
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

          
        }
      
        
        // Bootstrap.whenDocumentReady().then(function () {
        //   ko.applyBindings(new manageSourcesContentViewModel(), document.getElementById('popupWrapper'));
        // });

 
    return manageSourcesContentViewModel;
});

