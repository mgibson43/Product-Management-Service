# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS
## 10/27/2023
## Matthew Gibson

### Task C
- mainscreen.html: changed title on line 14
- mainscreen.html: changed headers on lines 18, 21, 53

### Task D
- about.html: created file
- about.html: added link to mainscreen.html on line 20
- about.html: added content in lines 23-42
<br><br>
- mainscreen.html: added link to about.html on line 21
<br><br>
- MainScreenControllerr: added GetMapping for about.html on line 56


### Task E
- BootStrapData.java: added products on lines 105-117
- BootStrapData.java: added parts on lines 48-85

### Task F
- mainscreen.html: added post form to submit purchase data on lines 88-91
- mainscreen.html: added margin-top class to div on line 18
<br><br>
- BuyProductController.java: created controller class to handle database transactions
- BuyProductController.java: added content/post mapping for product purchases on lines 18-51
<br><br>
- confirmationbuysuccess.html: created html page to handle successful purchases
- confirmationbuysuccess.html: added html content on lines 17-28
  <br><br>
- confirmationbuyfailure.html: created html page to handle unsuccessful purchases
- confirmationbuyfailure.html: added html content on lines 17-24

### Task G
- Part.java: added fields for maxInv and minInv on lines 31-34
- Part.java: added constructor containing new fields on lines 57-64
- Part.java: added setters and getters for maxInv and minInv on lines 106-120
- Part.java: added method 'isValidInv()' that checks if inventory is between maxInv and minInv on lines 140-142
<br><br>
- BootStrapData.java: added maxInv and minInv values for white keys on lines 54-55
- BootStrapData.java: added maxInv and minInv values for black keys on lines 63-64
- BootStrapData.java: added maxInv and minInv values for headphones keys on lines 72-73
- BootStrapData.java: added maxInv and minInv values for bench on lines 80-81
- BootStrapData.java: added maxInv and minInv values for music stand on lines 88-89
<br><br>
- OutsourcedPartForm.html: added input fields for maxInv and minInv on lines 25-29
- OutsourcedPartForm.html: added error messages on lines 24-25
<br><br>
- InhousePartForm.html: added input fields for maxInv and minInv on lines 24-28
- InhousePartForm.html: added error messages on lines 23-24
<br><br>
- application.properties: renamed database file to 'java-frameworks-database' on line 6
<br><br>
- AddInhousePartController.java: added code to verify inventory is within range on lines 43-45
- AddInhousePartController.java: added error messages to the model attribute on lines 45-50
<br><br>
- AddOutsourcedPartController.java: added code to verify inventory is within range on lines 44-46
- AddOutsorucedPartController.java: added error messages to the model attribute on lines 46-51

### Task H
- AddOutsourcedPartController.java: updated error messages on lines 47, 50
- BootStrapData.java: updated default values for White and Black key parts on lines 48-64