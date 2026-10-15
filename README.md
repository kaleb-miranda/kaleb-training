# Kaleb Training — Monorepo Java

Repositorio de entrenamiento de Kaleb Uriel Miranda Cadena.

## Estructura de paquetes

Paquete raíz: `com.kaleb.training`

| Subpaquete              | Fase | Contenido                              |
|-------------------------|------|----------------------------------------|
| `fase0_diagnostico`     | 0    | Ejercicios de diagnóstico               |
| `fase1_logica`          | 1    | Lógica, estructuras y algoritmos        |
| `fase1_5_estructuras`   | 1.5  | Estructuras de datos a mano             |
| `fase2_poo`             | 2    | POO, SOLID y patrones                   |
| `fase3_streams`         | 3    | Funcional, concurrencia y testing       |
| `fase4_backend_puro`    | 4    | Backend sin magia (JDBC)                |

## Reglas

1. Cada ejercicio en su propia clase, dentro del subpaquete `ejercicios`.
2. Cada proyecto de fase en el subpaquete `proyecto`.
3. **Nunca borrar código de fases anteriores.** Es un museo del progreso.
4. Las rutas de las clases creadas se referencian en `diario-de-vuelo.md`.

## Nota de nomenclatura

El plan de estudios llama al proyecto raíz `kaleb-training`. El directorio actual
es `practicarJava`; lo renombraremos/recrearemos oficialmente cuando crees el
repositorio en GitHub durante la Fase 0.5 (Git y terminal).
