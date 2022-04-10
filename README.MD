# Parkiraja-boot

## Registration Owner

```http
POST /localhost:8084/parkingowner
```

| Parameter | Type | Description |
| :--- | :--- | :--- |
| `id`| `string` | **NotRequired** |
| `name`| `string` | **Required** |
| `telephone`| `string` | **Required** |
| `address`|`string` | **Required** |


### Responses

```javascript
	{
    "id": "402880e98013e404018013e721d80001",
    "name": "Angga Pratama",
    "telephone": "082195614912",
    "address": "Jl.KemanggisanRaya No.6, Jakarta Barat.",
    "owner": []
	}
```

## OwnerList

```http
GET /localhost:8084/parkingowner
```

| Parameter | Type | Description |
| :--- | :--- | :--- |



### Responses

```javascript
{
    "content": [
        {
            "id": "402880e9800d070301800d071c060000",
            "name": "Angga Pratama",
            "telephone": "082195614912",
            "address": "Jl.KemanggisanRaya No.9, Jakarta Barat.",
            "owner": [
                {
                    "id": "402880e9800d36d301800d38e6240001",
                    "name": "Nice Parking",
                    "address": "Wisma 76 Slipi Jaya.",
                    "areaCoverage": "200",
                    "parkingCapacity": 20,
                    "category": "Car",
                    "hourPrice": 2000,
                    "parkingOwner": {
                        "id": "402880e9800d070301800d071c060000",
                        "name": "Angga Pratama",
                        "telephone": "082195614912",
                        "address": "Jl.KemanggisanRaya No.9, Jakarta Barat."
                    },
                    "transactions": [
                        {
                            "id": "402880e9801228e00180122f64070000",
                            "policeNumber": "BA 499123 RFS",
                            "vehicleType": "Car",
                            "checkIn": "1970-01-01T06:21:39.067+00:00",
                            "checkOut": "1970-01-01T06:46:01.731+00:00",
                            "subTotal": null,
                            "parkingArea": {
                                "id": "402880e9800d36d301800d38e6240001",
                                "name": "Nice Parking",
                                "address": "Wisma 76 Slipi Jaya.",
                                "areaCoverage": "200",
                                "parkingCapacity": 20,
                                "category": "Car",
                                "hourPrice": 2000,
                                "parkingOwner": {
                                    "id": "402880e9800d070301800d071c060000",
                                    "name": "Angga Pratama",
                                    "telephone": "082195614912",
                                    "address": "Jl.KemanggisanRaya No.9, Jakarta Barat."
                                }
                            }
                        },
                        {
                            "id": "402880e9801232db01801239c31e0000",
                            "policeNumber": "BA 337721 RFS",
                            "vehicleType": "Motorcycle",
                            "checkIn": "1970-01-01T06:46:57.048+00:00",
                            "checkOut": null,
                            "subTotal": null,
                            "parkingArea": {
                                "id": "402880e9800d36d301800d38e6240001",
                                "name": "Nice Parking",
                                "address": "Wisma 76 Slipi Jaya.",
                                "areaCoverage": "200",
                                "parkingCapacity": 20,
                                "category": "Car",
                                "hourPrice": 2000,
                                "parkingOwner": {
                                    "id": "402880e9800d070301800d071c060000",
                                    "name": "Angga Pratama",
                                    "telephone": "082195614912",
                                    "address": "Jl.KemanggisanRaya No.9, Jakarta Barat."
                                }
                            }
                        }
                    ]
                },
                {
                    "id": "402880e9800d5da301800d61ae620000",
                    "name": "Syahdan Parking",
                    "address": "Jl.KH syahdan no.26",
                    "areaCoverage": "500",
                    "parkingCapacity": 1000,
                    "category": "MotorCycle",
                    "hourPrice": 2000,
                    "parkingOwner": {
                        "id": "402880e9800d070301800d071c060000",
                        "name": "Angga Pratama",
                        "telephone": "082195614912",
                        "address": "Jl.KemanggisanRaya No.9, Jakarta Barat."
                    },
                    "transactions": []
                }
            ]
        }
    ],
    "pageable": {
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 0,
        "pageSize": 20,
        "pageNumber": 0,
        "unpaged": false,
        "paged": true
    },
    "totalElements": 1,
    "totalPages": 1,
    "last": true,
    "size": 20,
    "number": 0,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "numberOfElements": 1,
    "first": true,
    "empty": false
}
```

## Owner Update

```http
PUT /localhost:8084/parkingowner
```

| Parameter | Type | Description |
| :--- | :--- | :--- |
| `id`| `string` | **Required** |
| `name`| `string` | **Required** |
| `telephone`| `string` | **Required** |
| `address`|`string` | **Required** |


### Responses

```javascript
{
    "id": "402880e9800d070301800d071c060000",
    "name": "Angga Pratama",
    "telephone": "082195614912",
    "address": "Jl.KemanggisanRaya No.9, Jakarta Barat."
}
```


## Owner Search 

```http
GET localhost:8084/parkingowner/402880e9800d070301800d071c060000
```

| Parameter | Type | Description |
| :--- | :--- | :--- |
| id| `string` | **Required** |


### Responses

```javascript
{
    {
    "id": "402880e9800d070301800d071c060000",
    "name": "Angga Pratama",
    "telephone": "082195614912",
    "address": "Jl.KemanggisanRaya No.9, Jakarta Barat.",
    "owner": [
        {
            "id": "402880e9800d36d301800d38e6240001",
            "name": "Nice Parking",
            "address": "Wisma 76 Slipi Jaya.",
            "areaCoverage": "200",
            "parkingCapacity": 20,
            "category": "Car",
            "hourPrice": 2000,
            "parkingOwner": {
                "id": "402880e9800d070301800d071c060000",
                "name": "Angga Pratama",
                "telephone": "082195614912",
                "address": "Jl.KemanggisanRaya No.9, Jakarta Barat."
            },
            "transactions": [
                {
                    "id": "402880e98013a7d4018013a7e6db0000",
                    "policeNumber": "BA 33nn7721 RFS",
                    "vehicleType": "Car",
                    "checkIn": "20:26:52",
                    "checkOut": null,
                    "subTotal": null,
                    "parkingArea": {
                        "id": "402880e9800d36d301800d38e6240001",
                        "name": "Nice Parking",
                        "address": "Wisma 76 Slipi Jaya.",
                        "areaCoverage": "200",
                        "parkingCapacity": 20,
                        "category": "Car",
                        "hourPrice": 2000,
                        "parkingOwner": {
                            "id": "402880e9800d070301800d071c060000",
                            "name": "Angga Pratama",
                            "telephone": "082195614912",
                            "address": "Jl.KemanggisanRaya No.9, Jakarta Barat."
                        }
                    }
                },
                {
                    "id": "402880e98013be1b018013be78a20000",
                    "policeNumber": "BA 33nn7721 RFS",
                    "vehicleType": "Car",
                    "checkIn": "20:51:31",
                    "checkOut": null,
                    "subTotal": null,
                    "parkingArea": {
                        "id": "402880e9800d36d301800d38e6240001",
                        "name": "Nice Parking",
                        "address": "Wisma 76 Slipi Jaya.",
                        "areaCoverage": "200",
                        "parkingCapacity": 20,
                        "category": "Car",
                        "hourPrice": 2000,
                        "parkingOwner": {
                            "id": "402880e9800d070301800d071c060000",
                            "name": "Angga Pratama",
                            "telephone": "082195614912",
                            "address": "Jl.KemanggisanRaya No.9, Jakarta Barat."
                        }
                    }
                },
                {
                    "id": "402880e98013de83018013df66af0000",
                    "policeNumber": "BA 22231 RFS",
                    "vehicleType": "Honda",
                    "checkIn": "21:26:44",
                    "checkOut": null,
                    "subTotal": null,
                    "parkingArea": {
                        "id": "402880e9800d36d301800d38e6240001",
                        "name": "Nice Parking",
                        "address": "Wisma 76 Slipi Jaya.",
                        "areaCoverage": "200",
                        "parkingCapacity": 20,
                        "category": "Car",
                        "hourPrice": 2000,
                        "parkingOwner": {
                            "id": "402880e9800d070301800d071c060000",
                            "name": "Angga Pratama",
                            "telephone": "082195614912",
                            "address": "Jl.KemanggisanRaya No.9, Jakarta Barat."
                        }
                    }
                },
                {
                    "id": "402880e98013e372018013e384a60000",
                    "policeNumber": "BA 22asd231 RFS",
                    "vehicleType": "Car",
                    "checkIn": "21:31:59",
                    "checkOut": null,
                    "subTotal": null,
                    "parkingArea": {
                        "id": "402880e9800d36d301800d38e6240001",
                        "name": "Nice Parking",
                        "address": "Wisma 76 Slipi Jaya.",
                        "areaCoverage": "200",
                        "parkingCapacity": 20,
                        "category": "Car",
                        "hourPrice": 2000,
                        "parkingOwner": {
                            "id": "402880e9800d070301800d071c060000",
                            "name": "Angga Pratama",
                            "telephone": "082195614912",
                            "address": "Jl.KemanggisanRaya No.9, Jakarta Barat."
                        }
                    }
                },
                {
                    "id": "402880e98013e404018013e4104e0000",
                    "policeNumber": "BA 22d231 RFS",
                    "vehicleType": "Car",
                    "checkIn": "21:32:35",
                    "checkOut": null,
                    "subTotal": null,
                    "parkingArea": {
                        "id": "402880e9800d36d301800d38e6240001",
                        "name": "Nice Parking",
                        "address": "Wisma 76 Slipi Jaya.",
                        "areaCoverage": "200",
                        "parkingCapacity": 20,
                        "category": "Car",
                        "hourPrice": 2000,
                        "parkingOwner": {
                            "id": "402880e9800d070301800d071c060000",
                            "name": "Angga Pratama",
                            "telephone": "082195614912",
                            "address": "Jl.KemanggisanRaya No.9, Jakarta Barat."
                        }
                    }
                },
                {
                    "id": "402880e9801228e00180122f64070000",
                    "policeNumber": "BA 499123 RFS",
                    "vehicleType": "Car",
                    "checkIn": "13:21:39.067",
                    "checkOut": "13:46:01.731",
                    "subTotal": null,
                    "parkingArea": {
                        "id": "402880e9800d36d301800d38e6240001",
                        "name": "Nice Parking",
                        "address": "Wisma 76 Slipi Jaya.",
                        "areaCoverage": "200",
                        "parkingCapacity": 20,
                        "category": "Car",
                        "hourPrice": 2000,
                        "parkingOwner": {
                            "id": "402880e9800d070301800d071c060000",
                            "name": "Angga Pratama",
                            "telephone": "082195614912",
                            "address": "Jl.KemanggisanRaya No.9, Jakarta Barat."
                        }
                    }
                },
                {
                    "id": "402880e9801232db01801239c31e0000",
                    "policeNumber": "BA 499123 RFS",
                    "vehicleType": "Car",
                    "checkIn": "13:46:57",
                    "checkOut": "18:21:22",
                    "subTotal": 5000,
                    "parkingArea": {
                        "id": "402880e9800d36d301800d38e6240001",
                        "name": "Nice Parking",
                        "address": "Wisma 76 Slipi Jaya.",
                        "areaCoverage": "200",
                        "parkingCapacity": 20,
                        "category": "Car",
                        "hourPrice": 2000,
                        "parkingOwner": {
                            "id": "402880e9800d070301800d071c060000",
                            "name": "Angga Pratama",
                            "telephone": "082195614912",
                            "address": "Jl.KemanggisanRaya No.9, Jakarta Barat."
                        }
                    }
                },
                {
                    "id": "402880e98013a3b0018013a3cf390000",
                    "policeNumber": "BA 33nn7721 RFS",
                    "vehicleType": "Car",
                    "checkIn": "20:22:24",
                    "checkOut": null,
                    "subTotal": null,
                    "parkingArea": {
                        "id": "402880e9800d36d301800d38e6240001",
                        "name": "Nice Parking",
                        "address": "Wisma 76 Slipi Jaya.",
                        "areaCoverage": "200",
                        "parkingCapacity": 20,
                        "category": "Car",
                        "hourPrice": 2000,
                        "parkingOwner": {
                            "id": "402880e9800d070301800d071c060000",
                            "name": "Angga Pratama",
                            "telephone": "082195614912",
                            "address": "Jl.KemanggisanRaya No.9, Jakarta Barat."
                        }
                    }
                }
            ]
        },
        {
            "id": "402880e9800d5da301800d61ae620000",
            "name": "Syahdan Parking",
            "address": "Jl.KH syahdan no.26",
            "areaCoverage": "500",
            "parkingCapacity": 1000,
            "category": "MotorCycle",
            "hourPrice": 2000,
            "parkingOwner": {
                "id": "402880e9800d070301800d071c060000",
                "name": "Angga Pratama",
                "telephone": "082195614912",
                "address": "Jl.KemanggisanRaya No.9, Jakarta Barat."
            },
            "transactions": []
        }
    ]
}
```

## Registration ParkingArea

```http
POST /localhost:8084/parkingowner
```

| Parameter | Type | Description |
| :--- | :--- | :--- |
| `id`| `string` | **NotRequired** |
| `name`| `string` | **Required** |
| `parkingCapacity`| `integer`| **Required** |
| `address`|`string` | **Required** |
| `parkingOwner`|`string` | **Required** |
| `category`|`string` | **Required** |
| `price`|`integer` | **Required** |



### Responses

```javascript
	{
    "name":"Beverlly Parking",
    "address":"Jl.SukaBumi Utara no.26",
    "areaCoverage":500,
    "parkingCapacity":1000,
    "parkingOwner":{
        "id":"402880e9800d070301800d071c060000"
    },
    "vehicle":{
        "id":"402880e980140bbf0180140c5fef0002"
    },
    "hourPrice":2000
} 	
```

## OwnerList

```http
GET /localhost:8084/parkingowner
```

| Parameter | Type | Description |
| :--- | :--- | :--- |



### Responses

```javascript
             {
    "content": [
        {
            "id": "402880e9801430510180143122d60000",
            "name": "Beverlly Parking",
            "address": "Jl.SukaBumi Utara no.26",
            "areaCoverage": "500",
            "parkingCapacity": 1000,
            "vehicle": {
                "id": "402880e980140bbf0180140c5fef0002",
                "name": "Car",
                "weight": 5
            },
            "hourPrice": 2000,
            "parkingOwner": {
                "id": "402880e9800d070301800d071c060000",
                "name": "Angga Pratama",
                "telephone": "082195614912",
                "address": "Jl.KemanggisanRaya No.9, Jakarta Barat."
            },
            "transactions": []
        }
    ],
    "pageable": {
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 0,
        "pageSize": 20,
        "pageNumber": 0,
        "unpaged": false,
        "paged": true
    },
    "totalElements": 1,
    "totalPages": 1,
    "last": true,
    "size": 20,
    "number": 0,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "numberOfElements": 1,
    "first": true,
    "empty": false
}         
     
```

## CheckIn

```http
POST /localhost:8084/parkingVehicle/checkin
```

| Parameter | Type | Description |
| :--- | :--- | :--- |
| `piliceNumber`| `string` | **Required** |
| `checkIn`| `localtime`| **Required** |
| `vehicle`| `string` | **Required** |
| `parkingArea`|`string` | **Required** |


### Responses

```javascript
{
    "id": "402880e980141f7d0180142069b80002",
    "policeNumber": "BA 34244 RFS",
    "vehicle": {
        "id": "402880e980140bbf0180140c5fef0002",
        "name": null,
        "weight": null
    },
    "checkIn": "13:26:24",
    "checkOut": null,
    "subTotal": null,
    "parkingArea": {
        "id": "402880e98013e404018013eec48f0002",
        "name": null,
        "address": null,
        "areaCoverage": null,
        "parkingCapacity": null,
        "category": null,
        "hourPrice": null,
        "parkingOwner": null
    }
}
```

## CheckOut

```http
POST localhost:8084/parkingVehicle/checkout
```

| Parameter | Type | Description |
| :--- | :--- | :--- |
| `piliceNumber`| `string` | **Required** |
| `checkIn`| `localtime`| **Required** |
| `vehicle`| `string` | **Required** |
| `parkingArea`|`string` | **Required** |


### Responses

```javascript
{
    "id": "402880e980143051018014368ef10001",
    "policeNumber": "BA 499123 RFS",
    "vehicle": {
        "id": "402880e980140bbf0180140c5fef0002",
        "name": "Car",
        "weight": 5
    },
    "checkIn": "13:26:24",
    "checkOut": "23:03:25.633",
    "subTotal": 10000,
    "parkingArea": {
        "id": "402880e9801430510180143122d60000",
        "name": "Beverlly Parking",
        "address": "Jl.SukaBumi Utara no.26",
        "areaCoverage": "500",
        "parkingCapacity": 1000,
        "vehicle": {
            "id": "402880e980140bbf0180140c5fef0002",
            "name": "Car",
            "weight": 5
        },
        "hourPrice": 2000,
        "parkingOwner": {
            "id": "402880e9800d070301800d071c060000",
            "name": "Angga Pratama",
            "telephone": "082195614912",
            "address": "Jl.KemanggisanRaya No.9, Jakarta Barat."
        }
    }
}
```

```http history
GET localhost:8084/history
```
### Responses

```javascript
{
    "content": [
        {
            "id": "402880e980143051018014373b450002",
            "policeNumber": "BA 499123 RFS",
            "parkingArea": {
                "id": "402880e9801430510180143122d60000",
                "name": "Beverlly Parking",
                "address": "Jl.SukaBumi Utara no.26",
                "areaCoverage": "500",
                "parkingCapacity": 1000,
                "vehicle": {
                    "id": "402880e980140bbf0180140c5fef0002",
                    "name": "Car",
                    "weight": 5
                },
                "hourPrice": 2000,
                "parkingOwner": {
                    "id": "402880e9800d070301800d071c060000",
                    "name": "Angga Pratama",
                    "telephone": "082195614912",
                    "address": "Jl.KemanggisanRaya No.9, Jakarta Barat."
                }
            },
            "duration": 577,
            "total": 10000
        }
    ],
    "pageable": {
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 0,
        "pageSize": 20,
        "pageNumber": 0,
        "unpaged": false,
        "paged": true
    },
    "totalElements": 1,
    "totalPages": 1,
    "last": true,
    "size": 20,
    "number": 0,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "numberOfElements": 1,
    "first": true,
    "empty": false
}
```

## MstVehicle

```http
POST localhost:8084/vehicle
```


### Responses

```javascript
{
    "id": "402880e980140bbf0180140c836a0003",
    "name": "MotorCycle",
    "weight": 2
},
{
    "id": "402880e980140bbf0180140c836a0002",
    "name": "Car",
    "weight": 5
}
```


# Status Codes


| Status Code | Description |
| :--- | :--- |
| 200 | `OK` |
| 201 | `CREATED` |
| 400 | `BAD REQUEST` |
| 404 | `NOT FOUND` |
| 500 | `INTERNAL SERVER ERROR` |

