{
  "id": "8a649ba2-f7f0-44cd-becb-7d6c25fb7011",
  "version": "2.0",
  "name": "myapp",
  "url": "http://localhost:8080/",
  "tests": [{
    "id": "a92f78ca-32f3-4685-9a25-10aaa21a6f9d",
    "name": "myapp",
    "commands": [{
      "id": "e5a76f0e-a47b-42f6-ae98-530788557e97",
      "comment": "http://localhost:8080/",
      "command": "addSelection",
      "target": "http://localhost:8080/",
      "targets": [],
      "value": "http://localhost:8080/"
    }]
  }],
  "suites": [{
    "id": "5f51b772-b22f-4914-9bba-56289e348c6d",
    "name": "Default Suite",
    "persistSession": false,
    "parallel": false,
    "timeout": 300,
    "tests": ["a92f78ca-32f3-4685-9a25-10aaa21a6f9d"]
  }],
  "urls": [],
  "plugins": []
}