Feature: Login functionality


Background: sucessfully cancled Initial Login page
When user open "chrome" browser with exe as 
When user enter URL as 
When user cancle initial Login window


@smokeTest
Scenario:Login functionality with valid creadentials
When user navigate on Login button
When user click on MyProfile
When user enter "7743950511" as username
When user enter "Shital123@" as password
When user click on Login button
Then Application shows user profile to user
Then browser close


@RegrationTest
Scenario Outline: Login functionality with invalid username in UpperCase and valid password
When user navigate on Login button
When user click on MyProfile
When user enters <username> as username
When user enters <pssword> as password
When user click on Login button
Then Application shows appropriate error message
Then browser close

Examples:
     |username|password|
     |7743950511|@Shital123@|
     |743950511|@shital123@|


@RegrationTest
Scenario:Login functionality with valid usrname and invalid password in UpperCase
When user navigate on Login button
When user click on MyProfile
When user enter "7743950511" as username
When user enter "SHital123@" as password
When user click on Login button
Then Application shows appropriate error message
Then browser close