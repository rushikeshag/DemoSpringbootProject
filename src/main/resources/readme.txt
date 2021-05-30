
GET:
    URL: http://localhost:8080/getData/1 - the 1 is the id of the user


POST:
    Body : select Json.
    {
        "employerName": "xyz",
        "salary": 20000,
        "employerDocumentsList": [
            {
                "documentName": "demo.txt",
                "documentSize": 22.3
            }
        ]
    }

DELETE: http://localhost:8080/getData/1 - last 1 is the id of the user to delete.

PUT: Only implement to update name, please change employer name:
    URL: http://localhost:8080/update/employer

    {
        "id": 2,
        "employerName": "ram",
        "salary": 20000,
        "employerDocumentsList": [
            {
                "documentName": "demo.txt",
                "documentSize": 22.3
            }
        ]
    }

