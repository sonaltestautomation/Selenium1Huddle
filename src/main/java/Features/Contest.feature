Feature: Create Contest feature
Scenario: Create Contest Test scenario

Given Admin logs into app
Then admin creates contest
Then check contest status after creating contest
And admin schedules contest
Then check contest status after scheduling contest
And admin applies contest name and state filters to search contest
Then verifies if contest exists
Then move contest to DRAFT state
And Delete the contest
Then close the chromebrowser

