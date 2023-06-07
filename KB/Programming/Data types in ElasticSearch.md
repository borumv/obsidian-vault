---
created: Wednesday 7th June 2023 13:23
Last modified: Wednesday 7th June 2023 13:23
Aliases: типы данных в elasticsearch
Tags: programming
---

**Common types**
`binary`
Binary value encoded as a Base64 string.
`boolean`
`true` and `false` values.

- Keywords
The keyword family, including `keyword`, `constant_keyword`, and `wildcard`.

- Numbers
Numeric types, such as `long` and `double`, used to express amounts.

- Dates
Date types, including [`date`](https://www.elastic.co/guide/en/elasticsearch/reference/current/date.html "Date field type") and [`date_nanos`](https://www.elastic.co/guide/en/elasticsearch/reference/current/date_nanos.html "Date nanoseconds field type").

`alias` -Defines an alias for an existing field.

**Objects and relational types**
`object`-  JSON object.
`flattened` - An entire JSON object as a single field value.
`nested` - A JSON object that preserves the relationship between its subfields.
`join` - Defines a parent/child relationship for documents in the same index.

**Structured data types**
Range
Range types, such as `long_range`, `double_range`, `date_range`, and `ip_range`.
`ip`- IPv4 and IPv6 addresses.
`version`- Software versions. Supports [Semantic Versioning](https://semver.org/) precedence rules.
`murmur3` -Compute and stores hashes of values.

**Aggregate data types**
`aggregate_metric_double` - Pre-aggregated metric values.
`histogram` - Pre-aggregated numerical values in the form of a histogram.

**Text search types**
`text`- The text family, including `text` and `match_only_text`. Analyzed, unstructured text.
`annotated-text` - Text containing special markup. Used for identifying named entities.
`completion` - Used for auto-complete suggestions.
`search_as_you_type`
`text`-like type for as-you-type completion.
`token_count` - A count of tokens in a text.

**Document ranking types**

[`dense_vector`](https://www.elastic.co/guide/en/elasticsearch/reference/current/dense-vector.html "Dense vector field type")

Records dense vectors of float values.

[`rank_feature`](https://www.elastic.co/guide/en/elasticsearch/reference/current/rank-feature.html "Rank feature field type")

Records a numeric feature to boost hits at query time.

[`rank_features`](https://www.elastic.co/guide/en/elasticsearch/reference/current/rank-features.html "Rank features field type")

Records numeric features to boost hits at query time.

#### [](https://www.elastic.co/guide/en/elasticsearch/reference/current/mapping-types.html#spatial_datatypes)Spatial data types[edit](https://github.com/elastic/elasticsearch/edit/8.8/docs/reference/mapping/types.asciidoc "Edit this page on GitHub")

[`geo_point`](https://www.elastic.co/guide/en/elasticsearch/reference/current/geo-point.html "Geopoint field type")

Latitude and longitude points.

[`geo_shape`](https://www.elastic.co/guide/en/elasticsearch/reference/current/geo-shape.html "Geoshape field type")

Complex shapes, such as polygons.

[`point`](https://www.elastic.co/guide/en/elasticsearch/reference/current/point.html "Point field type")

Arbitrary cartesian points.

[`shape`](https://www.elastic.co/guide/en/elasticsearch/reference/current/shape.html "Shape field type")

Arbitrary cartesian geometries.

#### [](https://www.elastic.co/guide/en/elasticsearch/reference/current/mapping-types.html#other-types)Other types[edit](https://github.com/elastic/elasticsearch/edit/8.8/docs/reference/mapping/types.asciidoc "Edit this page on GitHub")

[`percolator`](https://www.elastic.co/guide/en/elasticsearch/reference/current/percolator.html "Percolator field type")

Indexes queries written in [Query DSL](https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl.html "Query DSL").