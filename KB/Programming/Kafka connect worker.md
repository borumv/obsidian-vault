---
created: Thursday 29th December 2022 13:57
Last modified: Thursday 29th December 2022 13:57
Aliases: worker
Tags: kafka
---

# [[Kafka connect worker]]

**Worker** - это экземпляр [[Kafka Connect]]. 
Kafka Connect можно запускать в двух режимах: **standalone** и **distributed**, на нескольких нодах или виртуальных машинах. То можно просто запустить один worker или собрать кластер worker’ов. Рекомендуется использовать standalone-режим при локальной разработке, настройке и отладке коннекторов, а distributed — в боевых условиях.

