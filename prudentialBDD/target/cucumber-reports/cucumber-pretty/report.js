$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("verifyLables.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Lables",
  "description": "",
  "id": "verify-lables",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify Lables on Home page",
  "description": "",
  "id": "verify-lables;verify-lables-on-home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User should be on Home page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "# When Weather Info page displayed"
    }
  ],
  "line": 7,
  "name": "Verify Lable Weather display",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Verify Lable Map display",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Verify Lable Guid display",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Verify Lable API display",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Verify Lable Price display",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Verify Lable Partners display",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Verify Lable Station display",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Verify Lable Widgets display",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Verify Lable Blog display",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Verify Lable OpenWeather Logo display",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Verify Lable Sign In display",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Verify Lable Sign Up display",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Verify Lable Support Center display",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Verify Lable Celcius Slide button display",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Verify Lable Fahrenheit Slide button display",
  "keyword": "Then "
});
formatter.match({
  "location": "WeatherInfoSteps.user_should_be_on_Home_page()"
});
formatter.result({
  "duration": 8872843057,
  "status": "passed"
});
formatter.match({
  "location": "LableSteps.verify_Lable_Weather_display()"
});
formatter.result({
  "duration": 136673319,
  "status": "passed"
});
formatter.match({
  "location": "LableSteps.verify_Lable_Map_display()"
});
formatter.result({
  "duration": 51450895,
  "status": "passed"
});
formatter.match({
  "location": "LableSteps.verify_Lable_Guid_display()"
});
formatter.result({
  "duration": 45643106,
  "status": "passed"
});
formatter.match({
  "location": "LableSteps.verify_Lable_API_display()"
});
formatter.result({
  "duration": 33739672,
  "status": "passed"
});
formatter.match({
  "location": "LableSteps.verify_Lable_Price_display()"
});
formatter.result({
  "duration": 43963746,
  "status": "passed"
});
formatter.match({
  "location": "LableSteps.verify_Lable_Partners_display()"
});
formatter.result({
  "duration": 37472153,
  "status": "passed"
});
formatter.match({
  "location": "LableSteps.verify_Lable_Station_display()"
});
formatter.result({
  "duration": 31067600,
  "status": "passed"
});
formatter.match({
  "location": "LableSteps.verify_Lable_Widgets_display()"
});
formatter.result({
  "duration": 31694516,
  "status": "passed"
});
formatter.match({
  "location": "LableSteps.verify_Lable_Blog_display()"
});
formatter.result({
  "duration": 31519298,
  "status": "passed"
});
formatter.match({
  "location": "LableSteps.verify_Lable_OpenWeather_Logo_display()"
});
formatter.result({
  "duration": 29749484,
  "status": "passed"
});
formatter.match({
  "location": "LableSteps.verify_Lable_Sign_In_display()"
});
formatter.result({
  "duration": 30556169,
  "status": "passed"
});
formatter.match({
  "location": "LableSteps.verify_Lable_Sign_Up_display()"
});
formatter.result({
  "duration": 35565806,
  "status": "passed"
});
formatter.match({
  "location": "LableSteps.verify_Lable_Support_Center_display()"
});
formatter.result({
  "duration": 28195279,
  "status": "passed"
});
formatter.match({
  "location": "LableSteps.verify_Lable_Celcius_Slide_button_display()"
});
formatter.result({
  "duration": 28212346,
  "status": "passed"
});
formatter.match({
  "location": "LableSteps.verify_Lable_Fahrenheit_Slide_button_display()"
});
formatter.result({
  "duration": 31716134,
  "status": "passed"
});
formatter.uri("weatherInfo.feature");
formatter.feature({
  "line": 1,
  "name": "Weather Details",
  "description": "",
  "id": "weather-details",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Get the City Weather Infomation",
  "description": "",
  "id": "weather-details;get-the-city-weather-infomation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test3"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User should be on Home page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "# When Weather Info page displayed"
    }
  ],
  "line": 7,
  "name": "Enter the Valid City Name \"Mumbai\" In Search filed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Verify the City Name \"Mumbai\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Verify Weather detail display",
  "keyword": "Then "
});
formatter.match({
  "location": "WeatherInfoSteps.user_should_be_on_Home_page()"
});
formatter.result({
  "duration": 10127739485,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mumbai",
      "offset": 27
    }
  ],
  "location": "WeatherInfoSteps.enter_the_Valid_City_Name_In_Search_filed(String)"
});
formatter.result({
  "duration": 147886691,
  "status": "passed"
});
formatter.match({
  "location": "WeatherInfoSteps.click_on_Search_Button()"
});
formatter.result({
  "duration": 4197996714,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mumbai",
      "offset": 22
    }
  ],
  "location": "WeatherInfoSteps.verify_the_City_Name(String)"
});
formatter.result({
  "duration": 1189258578,
  "status": "passed"
});
formatter.match({
  "location": "WeatherInfoSteps.verify_Weather_detail_display()"
});
formatter.result({
  "duration": 70665691,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Get the City Weather Infomation",
  "description": "",
  "id": "weather-details;get-the-city-weather-infomation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User should be on Home page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 15,
      "value": "#When Weather Info page displayed"
    }
  ],
  "line": 16,
  "name": "Enter the Invalid City Name \"testxyz\" In Search filed",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Click on Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Verify the search result \"not found\"",
  "keyword": "Then "
});
formatter.match({
  "location": "WeatherInfoSteps.user_should_be_on_Home_page()"
});
formatter.result({
  "duration": 11157192009,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testxyz",
      "offset": 29
    }
  ],
  "location": "WeatherInfoSteps.enter_the_Invalid_City_Name_In_Search_filed(String)"
});
formatter.result({
  "duration": 116411766,
  "status": "passed"
});
formatter.match({
  "location": "WeatherInfoSteps.click_on_Search_Button()"
});
formatter.result({
  "duration": 4783809645,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "not found",
      "offset": 26
    }
  ],
  "location": "WeatherInfoSteps.verify_the_search_result(String)"
});
formatter.result({
  "duration": 258493513,
  "status": "passed"
});
});