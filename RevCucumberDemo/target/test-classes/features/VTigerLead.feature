Feature:  This covers all the functinality of VTiger Lead
Background: 
           Given User is on Vtiger Lead login page
           And user enters valid data for Vtiger Lead login as "admin" and "admin"
           And User click on login button of Vtiger Lead
           And User click on navigation panel 
           And User click on marketing and leads
           
Scenario Outline: Create VTiger Lead and validate it
          When Add lead btn of Vtiger Lead
          And Enter firstnm as <firstnm> lastnm as <lastnm> and click on save button
          Then click on Leads link
          And Search created lead
          And verify the result of Vtiger lead
          And close the browser
Examples:      
          |firstnm|lastnm|
          |Sharmila|Malkar|
          
Scenario Outline: Update VTiger Lead and validate it
          When Search created lead for lead update firstnm as <firstNm> and lastnm as <lastNm>
          And Click on firstChckbox and click on edit symbol
          And Enter compnay nm as <companyName> and click on save button
          And For verification of VTiger lead update enter firstnm as <firstNm> lastnm as <lastNm> and companyName as <companyName> and click on search button of VTiger lead update
          And verify the result of Vtiger lead update
          And close the browser     
          
Examples:      
          |firstNm|lastNm|companyName|
          |Sharmila|Malkar|LNT|  
          
Scenario Outline: Delete VTiger Lead and validate it  
          When Search created lead for lead delete firstnm as <firstNm> and lastnm as <lastNm> and compnm as <companyName> 
          And Click on firstChckbox and click on delete symbol  
          And Click on yes button of confirmation pop up
          Then Enter fnm as <firstNm> lastnm as <lastNm> compnm as <companyName> for VTiger Lead delete
          And Verify the result of Vtiger lead delete   
          And close the browser
Examples:      
          |firstNm|lastNm|companyName|
          |Sharmila|Malkar|LNT|         