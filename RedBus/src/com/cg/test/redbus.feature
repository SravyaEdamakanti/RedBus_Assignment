Feature: RedBus 
Scenario: Book Ticket 
	Given The homePage of RedBus is displayed 
	When "Hyderabad" and "Pune" are provided 
	And Date of journey is selected 
	Then Select seat to book ticket
	And Enter details of the person