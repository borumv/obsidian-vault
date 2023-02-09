---
tags: [java, hibernate]
---

@ColumnTransformer
 ```java
@Column (name = "weight")
@ColumnTransormer(
	read = "weight / 2.0"
	write = "? * 2.0*"
)
float divideWeight;
```

@Formula
Это поле высчитывается при "выдёргивании" объекта из базы данных. Если что-то в базе поменялось, то оно не пересчитывается
```java

@Formula (" SELECT avg (p.cost) FROM Product p WHERE p.manufacturer_id = id") 
BigDecimal agManufacturerProductCost
```

@CreationTimestamp
```java
@Temporal (TemporalType.TIMESTAMP)
@Column (name = "created_at" ,  updatable = false)
@CreationTimestamp
LoacalDateTime createdAt
```

 @UpdateTimestamp
```java
@Temporal (TemporalType.TIMESTAMP)
@Column (name = "update_at")
@UpdateTimestamp
LoacalDateTime updatedAt
```
