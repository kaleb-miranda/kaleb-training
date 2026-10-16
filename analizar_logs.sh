#!/bin/bash
# Extrae el top 10 de IPs con más errores (4xx/5xx) de un log de acceso.
# Uso: ./analizar_logs.sh

grep -E ' (4[0-9]{2}|5[0-9]{2}) ' logs/access.log \
  | awk '{print $1}' \
  | sort \
  | uniq -c \
  | sort -nr \
  | head -10
