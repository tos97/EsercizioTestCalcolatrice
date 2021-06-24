$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Calcolatrice.feature");
formatter.feature({
  "line": 1,
  "name": "Exercise on calculator",
  "description": "",
  "id": "exercise-on-calculator",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "two number 15 and 5",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "15",
      "offset": 11
    },
    {
      "val": "5",
      "offset": 18
    }
  ],
  "location": "CalcolatriceStep.setNumber(int,int)"
});
formatter.result({
  "duration": 142878000,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Calculator sum",
  "description": "",
  "id": "exercise-on-calculator;calculator-sum",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Calculator"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "result sum is 20",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 14
    }
  ],
  "location": "CalcolatriceStep.resultSum(float)"
});
formatter.result({
  "duration": 5000900,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "two number 15 and 5",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "15",
      "offset": 11
    },
    {
      "val": "5",
      "offset": 18
    }
  ],
  "location": "CalcolatriceStep.setNumber(int,int)"
});
formatter.result({
  "duration": 152400,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Calculator dif",
  "description": "",
  "id": "exercise-on-calculator;calculator-dif",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Calculator"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "result dif is 10",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 14
    }
  ],
  "location": "CalcolatriceStep.resultDif(float)"
});
formatter.result({
  "duration": 95800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "two number 15 and 5",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "15",
      "offset": 11
    },
    {
      "val": "5",
      "offset": 18
    }
  ],
  "location": "CalcolatriceStep.setNumber(int,int)"
});
formatter.result({
  "duration": 132400,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Calculator mpy",
  "description": "",
  "id": "exercise-on-calculator;calculator-mpy",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@Calculator"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "result mpy is 75",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "75",
      "offset": 14
    }
  ],
  "location": "CalcolatriceStep.resultMpy(float)"
});
formatter.result({
  "duration": 108400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "two number 15 and 5",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "15",
      "offset": 11
    },
    {
      "val": "5",
      "offset": 18
    }
  ],
  "location": "CalcolatriceStep.setNumber(int,int)"
});
formatter.result({
  "duration": 150400,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Calculator div",
  "description": "",
  "id": "exercise-on-calculator;calculator-div",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@Calculator"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "result div is 3",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 14
    }
  ],
  "location": "CalcolatriceStep.resultDiv(float)"
});
formatter.result({
  "duration": 123600,
  "status": "passed"
});
formatter.uri("CalcolatriceTable.feature");
formatter.feature({
  "line": 1,
  "name": "Exercise on calculator with Scenario outline",
  "description": "\r\nRule: Only DataTable",
  "id": "exercise-on-calculator-with-scenario-outline",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Calculator sum with DataTables",
  "description": "",
  "id": "exercise-on-calculator-with-scenario-outline;calculator-sum-with-datatables",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Outline"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "number \u003cnumber1\u003e and \u003cnumber2\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "result sum DataTable is \u003cresult\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "exercise-on-calculator-with-scenario-outline;calculator-sum-with-datatables;",
  "rows": [
    {
      "cells": [
        "number1",
        "number2",
        "result"
      ],
      "line": 10,
      "id": "exercise-on-calculator-with-scenario-outline;calculator-sum-with-datatables;;1"
    },
    {
      "cells": [
        "10",
        "10",
        "20"
      ],
      "line": 11,
      "id": "exercise-on-calculator-with-scenario-outline;calculator-sum-with-datatables;;2"
    },
    {
      "cells": [
        "10",
        "15",
        "25"
      ],
      "line": 12,
      "id": "exercise-on-calculator-with-scenario-outline;calculator-sum-with-datatables;;3"
    },
    {
      "cells": [
        "25",
        "25",
        "50"
      ],
      "line": 13,
      "id": "exercise-on-calculator-with-scenario-outline;calculator-sum-with-datatables;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Calculator sum with DataTables",
  "description": "",
  "id": "exercise-on-calculator-with-scenario-outline;calculator-sum-with-datatables;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Outline"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "number 10 and 10",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "result sum DataTable is 20",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 7
    },
    {
      "val": "10",
      "offset": 14
    }
  ],
  "location": "DataProvaCalcolatrice.setNumberDataTable(int,int)"
});
formatter.result({
  "duration": 191200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 24
    }
  ],
  "location": "DataProvaCalcolatrice.resultSumDataTable(float)"
});
formatter.result({
  "duration": 192500,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Calculator sum with DataTables",
  "description": "",
  "id": "exercise-on-calculator-with-scenario-outline;calculator-sum-with-datatables;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Outline"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "number 10 and 15",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "result sum DataTable is 25",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 7
    },
    {
      "val": "15",
      "offset": 14
    }
  ],
  "location": "DataProvaCalcolatrice.setNumberDataTable(int,int)"
});
formatter.result({
  "duration": 180100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "25",
      "offset": 24
    }
  ],
  "location": "DataProvaCalcolatrice.resultSumDataTable(float)"
});
formatter.result({
  "duration": 118700,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Calculator sum with DataTables",
  "description": "",
  "id": "exercise-on-calculator-with-scenario-outline;calculator-sum-with-datatables;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Outline"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "number 25 and 25",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "result sum DataTable is 50",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "25",
      "offset": 7
    },
    {
      "val": "25",
      "offset": 14
    }
  ],
  "location": "DataProvaCalcolatrice.setNumberDataTable(int,int)"
});
formatter.result({
  "duration": 123700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 24
    }
  ],
  "location": "DataProvaCalcolatrice.resultSumDataTable(float)"
});
formatter.result({
  "duration": 106800,
  "status": "passed"
});
});