Feature: Manage Address
Background: user Succesfully login
When user open "chrome" browser with exe as 
When user enter URL as 
When user cancle initial Login window
When user navigate on Login button
When user click on MyProfile
When user enter "7743950511" as username 
When user enter "Shital123@" as password 
When user click on Login button

@SmokeTest
Scenario: validate manage address
When user click on manage address
When user click on add new address
When user enter "Shital" as a name
When user enter "7743950511" as mobile number
When user enter "413505" as pincode
When user enter "Donja" as locality
When user enter "Patil galli,at post donja taluka paranda district osmanabad" as address
When user select Home as address type
When user click on save button
Then address saved successfully
Then Application shows appropriate error message
Then browser close
