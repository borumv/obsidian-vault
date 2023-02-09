**GeoJSON** - это формат представления различных географических данных.
Объект (feature) в geojson состоит из geometry и дополнительных свойств (properties). Feature Collection - набор этих элементов.

Пример:
```json
{ "type": "FeatureCollection",
  "features": [
    { "type": "Feature",
      "geometry": {"type": "Point", "coordinates": [102.0, 0.5]},
      "properties": {"prop0": "value0"}
      },
    { "type": "Feature",
      "geometry": {
        "type": "LineString",
        "coordinates": [
          [102.0, 0.0], [103.0, 1.0], [104.0, 0.0], [105.0, 1.0]
          ]
        },
      "properties": {
        "prop0": "value0",
        "prop1": 0.0
        }
      },
    { "type": "Feature",
       "geometry": {
         "type": "Polygon",
         "coordinates": [
           [ [100.0, 0.0], [101.0, 0.0], [101.0, 1.0],
             [100.0, 1.0], [100.0, 0.0] ]
           ]
       },
       "properties": {
         "prop0": "value0",
         "prop1": {"this": "that"}
         }
       }
     ]
   }
```

-   Объект GeoJSON может иметь произвольное количество свойств (пар ключ/значение).
-   Объект GeoJSON должен иметь свойство «type». Значение этого свойства – строка, содержащая тип объекта GeoJSON.
-   Значение свойства «type» должно принимать одно из следующих значений: «Point», «MultiPoint», «LineString», «MultiLineString», «Polygon», «MultiPolygon», «GeometryCollection», «Feature» или «FeatureCollection». Регистр символов значения поля «type» имеет значение.
-   Объект GeoJSON может иметь необязательное свойство «crs», значение которого должно содержать объект системы координат (см. [3. Объекты системы координат](https://gis-lab.info/docs/geojson_ru.html#03)).
-   Объект GeoJSON может иметь свойство «bbox», значение которого представляет массив координат вершин ограничивающего прямоугольника (см. [4. Ограничивающие прямоугольники](https://gis-lab.info/docs/geojson_ru.html#04)).
