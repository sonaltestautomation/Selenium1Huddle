$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Contest.feature");
formatter.feature({
  "line": 1,
  "name": "Create Contest feature",
  "description": "",
  "id": "create-contest-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Create Contest Test scenario",
  "description": "",
  "id": "create-contest-feature;create-contest-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Admin logs into app",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "admin creates contest",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "check contest status after creating contest",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "admin schedules contest",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "check contest status after scheduling contest",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "admin applies contest name and state filters to search contest",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "verifies if contest exists",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "move contest to DRAFT state",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Delete the contest",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "close the chromebrowser",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateContestStepDef.login_To_App()"
});
formatter.result({
  "duration": 71537232792,
  "status": "passed"
});
formatter.match({
  "location": "CreateContestStepDef.create_contest()"
});
formatter.result({
  "duration": 8288910989,
  "status": "passed"
});
formatter.match({
  "location": "CreateContestStepDef.check_contest_status_after_creating_contest()"
});
formatter.result({
  "duration": 817169658,
  "status": "passed"
});
formatter.match({
  "location": "CreateContestStepDef.admin_schedules_contest()"
});
formatter.result({
  "duration": 11889760473,
  "status": "passed"
});
formatter.match({
  "location": "CreateContestStepDef.check_contest_status_after_scheduling_contest()"
});
formatter.result({
  "duration": 25783840,
  "status": "passed"
});
formatter.match({
  "location": "CreateContestStepDef.apply_filters()"
});
formatter.result({
  "duration": 2320258823,
  "status": "passed"
});
formatter.match({
  "location": "CreateContestStepDef.verification_of_createdContest()"
});
formatter.result({
  "duration": 23123106,
  "status": "passed"
});
formatter.match({
  "location": "CreateContestStepDef.contest_to_DRAFT()"
});
formatter.result({
  "duration": 306472667,
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d81.0.4044.138)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027IN-WKS-100\u0027, ip: \u0027192.168.42.155\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.138, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\sonal.k\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:49418}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 6486f2fe15950caabae271a4bacd7c89\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat jdk.internal.reflect.GeneratedMethodAccessor2.invoke(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat Util.TestUtil.click_on_Element(TestUtil.java:12)\r\n\tat Pages.CreateContestPage.ready_To_Draft(CreateContestPage.java:206)\r\n\tat StepDefinition.CreateContestStepDef.contest_to_DRAFT(CreateContestStepDef.java:79)\r\n\tat ✽.Then move contest to DRAFT state(Contest.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CreateContestStepDef.deleteContest()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateContestStepDef.close()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login fearure",
  "description": "",
  "id": "login-fearure",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Check if user is able to successfully login.",
  "description": "",
  "id": "login-fearure;check-if-user-is-able-to-successfully-login.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of page is 1Huddle Admin",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user logs into app",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user is on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 7953014339,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d81.0.4044.138)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027IN-WKS-100\u0027, ip: \u0027192.168.42.155\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.138, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\sonal.k\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:49467}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 5168446a3c47d69d6fb7e67afec9d9aa\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions$RemoteWindow.maximize(RemoteWebDriver.java:837)\r\n\tat Base.BaseClass.initialization(BaseClass.java:58)\r\n\tat StepDefinition.LoginStepDef.user_is_already_on_login_page(LoginStepDef.java:20)\r\n\tat ✽.Given user is already on login page(Login.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDef.validate_page_title()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDef.user_logsIn()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDef.dashboard_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDef.close_Browser()"
});
formatter.result({
  "status": "skipped"
});
});