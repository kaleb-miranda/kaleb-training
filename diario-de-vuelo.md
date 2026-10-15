# Diario de Entrenamiento de Kaleb Uriel Miranda Cadena

Inicio: 13 de septiembre de 2026

---

## Sesión 1 - 13 de septiembre de 2026

**Tema trabajado:** Fase 0 (Diagnóstico) — Ejercicio 3: detección de duplicados sin `Set` y sin ordenar.

**Aprendizaje principal:** Conteo de frecuencias: usar el *valor* como *índice* de un arreglo de tamaño fijo (`contador[numero - 1]++`) para detectar duplicados en `O(n)`, en lugar de comparar todos contra todos (`O(n²)`). Trade-off espacio↔tiempo.

**Dificultad o error más relevante:** Confundir el arreglo de entrada con el arreglo contador; y al verbalizar, creer que el incremento era condicional cuando en realidad va **fuera** del `if` (se ejecuta siempre).

**Lección clave (escrita por Kaleb):** «Aprendí a ver cómo funciona internamente un Set (cómo "recuerda" lo ya visto) y a medir la complejidad de un algoritmo — que el crecimiento sea lineal.» *(Precisión del mentor: no fue un Set literal sino su mecanismo, y Big O mide el crecimiento, no exige linealidad.)*

**Commit:** [sin repositorio Git aún — Fase 0.5]

**Próximo paso:** Completar Ejercicios 1 (descomposición), 2 (lectura de API) y 4 (diseño) del diagnóstico.

**Clases creadas:** `fase0_diagnostico/ejercicios/EjemploConteoLetras.java` (análogo) y `fase0_diagnostico/ejercicios/DuplicadosSinSet.java` (solución).

---

## Sesión 2 - 8 de octubre de 2026

**Tema trabajado:** Fase 0 (Diagnóstico) — Ejercicio 1: descomposición del sistema de facturación (1 millón/día).

**Aprendizaje principal:** Descomponer un requisito de negocio en componentes con responsabilidades claras: ingestion (API + bucket + XML), validación de formato, deduplicación, detección de anomalías (monto vs historial del proveedor), almacenamiento separado y revisión manual. Aplicó el `HashSet` como "memoria de lo ya visto" para llaves arbitrarias.

**Dificultad o error más relevante:** (1) Primer intento: descartó el requisito de "montos sospechosos" para facilitar el problema y esquivó la escala de 1M/día. (2) En el diagrama final: regresión — escribió "nombre" en vez de "UUID" como llave de dedup, contradiciendo su propio acierto previo. (3) Asumió el "monto máximo histórico" como catálogo estático, cuando es un valor derivado que cambia.

**Lección clave (escrita por Kaleb):** «Aprendí a formar buenos hábitos si quiero resultados prontos y firmes — aplica al software y a la vida — y a pasar problemas reales a la abstracción de la programación.»

**Commit:** [sin repositorio Git aún — Fase 0.5]

**Próximo paso:** Ejercicio 1 APROBADO (descomposición lograda). Siguiente: Ejercicio 2 (lectura de API) y Ejercicio 4 (diseño de biblioteca).

**Conexión clave:** La deduplicación de facturas es el mismo problema que el Ejercicio 3, pero con UUIDs (llaves ilimitadas) → `HashSet`/índice único, en lugar del arreglo de 1000 casillas.

---

## Sesión 3 - 9 de octubre de 2026

**Tema trabajado:** Fase 0 (Diagnóstico) — Ejercicio 2: lectura de API (`Stream.reduce`).

**Aprendizaje principal:** Leer la firma de un método distinguiendo identidad vs sin identidad: `reduce(BinaryOperator)` devuelve `Optional` (puede no haber resultado), mientras que `reduce(identity, accumulator, combiner)` devuelve un valor directo (siempre hay resultado, partiendo del identity). Ejemplos: sumar → identity `0`; concatenar → identity `""`; máximo → sin identity.

**Dificultad o error más relevante:** Entró en cero con genéricos/Streams (material de Fase 3, esperado). Primer intento no distinguía las firmas. Confundió cuándo usar la Firma A: propuso "sumar", que en realidad usa la B (identity = 0). Lo corrigió con el ejemplo del máximo (sin identity).

**Lección clave (escrita por Kaleb):** «Hoy aprendí que `Stream.reduce` tiene una versión simple que devuelve `Optional<T>` (reducir al mismo tipo, sin valor inicial) y una versión más general con identity, accumulator y combiner para cambiar de tipo, tener valor por defecto y soportar reducción paralela.»

**Commit:** [sin repositorio Git aún — Fase 0.5]

**Próximo paso:** Ejercicio 4 (diseño del sistema de biblioteca con préstamos, devoluciones, multas y reservas). Balance: 3 de 4.

---

## Sesión 4 - 12 de octubre de 2026

**Tema trabajado:** Fase 0 (Diagnóstico) — Ejercicio 4: diseño del sistema de biblioteca (préstamos, devoluciones, multas, reservas).

**Aprendizaje principal:** Modelado entidad-relación. Distinguir título (Libro) de copia física (Copia/Ejemplar). Reconocer la transacción (Préstamo) como entidad central, no como verbo. Normalizar (Préstamo referencia a Copia, no a Libro). Modelar ciclo de vida con estados: activo → vencido/renovado → devuelto/perdido → cerrado.

**Dificultad o error más relevante:** Primeros intentos narraban el proceso en vez de modelar entidades. Omitió "reservas" (requisito) y "préstamo" (entidad central), llamándola "ficha". Pegó la Multa al Usuario en vez del Préstamo. Lo corrigió todo en el intento final.

**Lección clave (escrita por Kaleb):** «Aprendí a pensar lógicamente — es decir, a abstraer un sistema del mundo real a la lógica de software utilizando entidades, clases y objetos.»

**Commit:** [sin repositorio Git aún — Fase 0.5]

**Próximo paso:** FASE 0 COMPLETADA (4/4). Siguiente: Fase 0.5 — Git y terminal.

---

## CIERRE DE FASE 0 — DIAGNÓSTICO COMPLETO

**Resultado:** 4/4 ejercicios aprobados.

- **Ejercicio 3 (lógica):** construyó solución O(n) correcta, con guía. Bien en razonamiento con pistas.
- **Ejercicio 1 (descomposición):** logró descomponer en 6 componentes. Tendencia a descartar requisitos y esquivar la escala (corregida).
- **Ejercicio 2 (lectura de API):** entró en cero, aprendió rápido; distinguió identidad vs sin identidad. Genéricos/Streams = material Fase 3.
- **Ejercicio 4 (diseño):** pasó de narrar a un modelo entidad-relación profesional (6 entidades, normalización, ciclo de vida).

**Perfil confirmado:** enseñable, honesto, mejora fuerte dentro de una misma sesión. Brechas a trabajar: disciplina de requisitos, genéricos/API, formalización de modelos (Fases 1.5, 2, 3).

---

## NOTA DE CONTEXTO — 12 de octubre de 2026

**Meta real (motivación):** Kaleb trabaja en BBVA como externo (consultora) y debe aprobar la certificación interna **APX** para permanecer. Fecha estimada: **julio/agosto de 2027** (~40 semanas desde hoy).

**Contexto técnico:** En BBVA usan una versión modificada de Spring (sin anotaciones, o no todas). El examen APX es de nivel Java senior: incluye lectura de "código revuelto" (comprensión de código ajeno), estructuras de datos, concurrencia.

**Implicación para el plan:** El curriculum (~39-49 semanas) cabe en el plazo. Enfatizar: lectura de código ajeno (Fase 2), internals de colecciones (Fase 1.5), concurrencia (Fase 3), Spring Core sin anotaciones (Fases 5-6).

**Advertencia del mentor:** tendencia al "vibecoding" por deadlines cortos. Riesgo directo para el examen (que evalúa comprensión, no memorización).

---

## ANÁLISIS DEL EXAMEN APX — 12 de octubre de 2026

Revisado `estudio_con_clave.md` (254 preguntas de la Certificación APX).

**Composición del examen:**
- ~80-85% Java estándar nivel certificación (estilo OCA/OCP): POO (herencia, overriding, abstract, constructores), excepciones (try/catch/finally), Strings (== vs equals, intern, inmutabilidad), control de flujo, colecciones (List/Set/Map, Comparable/Comparator), genéricos, concurrencia (Thread, synchronized, wait/notify, yield), Streams/lambdas (filter, distinct, equals/hashCode), patrones (Singleton), Maven.
- ~15-20% tooling interno BBVA/APX: CLI "apx" (apx init, apx send req), "du-lib" (deployment unit library), apx.yaml, config.yaml.

**Mapeo al curriculum:**
- Parte Java → Fases 1, 1.5, 2, 3 (ya cubiertas por el plan; solo afinar énfasis).
- Parte APX (CLI, deployment units) → NO está en el plan; memorización de tooling interno que Kaleb estudia por su cuenta (documentación BBVA). Es la parte fácil (memoria) vs la difícil (Java, comprensión).

**Énfasis a reforzar (temas recurrentes):**
- Strings: == vs equals, interning, inmutabilidad (~4 apariciones).
- try/catch/finally: orden exacto de ejecución.
- Overriding: visibilidad y tipos de retorno.
- Concurrencia borde: wait/notify, Thread.yield.
- Colecciones + Comparable/Comparator.
- Streams + equals/hashCode + distinct.

**Estrategia ética acordada:** usar el examen como brújula de TEMAS (calibrar qué drill), no como banco de respuestas memorizadas. La meta es comprensión, no memorización.
