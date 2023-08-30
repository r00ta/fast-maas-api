#!/bin/bash

# Initialize variables with default values
host=
port=
database_user=
database_pass=
database_host=
database_name=

# Parse command-line options using getopt
options=$(getopt -o h:p:u:P:H:d: --long host:,port:,dbuser:,dbpassword:,dbhost:,dbname: -n 'script' -- "$@")
eval set -- "$options"

# Process command-line options
while true; do
  case "$1" in
    --host) host="$2"; shift 2;;
    --port) port="$2"; shift 2;;
    --dbuser) database_user="$2"; shift 2;;
    --dbpassword) database_pass="$2"; shift 2;;
    --dbhost) database_host="$2"; shift 2;;
    --dbname) database_name="$2"; shift 2;;
    --) shift; break;;
    *) echo "Invalid option: $1"; exit 1;;
  esac
done

echo 'Starting maas-fast-api jar..'

# Check if all required properties are set
if [[ -z "$host" || -z "$port" || -z "$database_user" || -z "$database_pass" || -z "$database_host" || -z "$database_name" ]]; then
    echo "Error: Some properties are not set."
    exit 1
fi

export QUARKUS_HTTP_HOST=$host
export QUARKUS_HTTP_PORT=$port
export MAAS_DB_USERNAME=$database_user
export MAAS_DB_PASSWORD=$database_pass
export MAAS_DB_HOST=$database_host
export MAAS_DB_SCHEMA=$database_name

java -jar $SNAP/quarkus-app/quarkus-run.jar