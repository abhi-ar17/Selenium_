Feature: MakeMyTrip


Background:
Given User launches the Make My Trip website

Scenario Outline:Book flight

When User select from_location as '<from>' and to_location as '<to>' and day as '<day>' year as '<monthyear>' and search
Then List of flights should be displayed and first one is selected
Then User enters Firstname as '<fname>' and lastname as '<lname>' and gender as '<gendeR>' and mobilnum as '<phNum>' and mailid as '<Email>'
Then User enters the payment details card number as '<cc>' and name as '<name>' and expirty month as '<month>' and expiry year as '<year>' and cvv as '<cvv>'

Examples:
|from|to|day|monthyear|fname|lname|gendeR|phNum|Email|cc|name|month|year|cvv|
|Chennai|Mumbai|15|April 2020|Abhi|A S|Male|8129180000|asabhirag@gmail.com|4567098218491947|Abhi A S|06|2024|455|