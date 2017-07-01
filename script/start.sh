#!/bin/bash

PROP="../conf/local/server.properties"

case "$1" in
  "" )
    echo "No input property file provided.."
    echo "Example: ${0} ../conf/local/server.properties"
    echo "It will run with .../conf/local/server.properties"
    ;;
  * )
    PROP=$1
	  ;;
esac

EXEC_FILE="$0"
BASE_NAME=`basename "$EXEC_FILE"`
if [ "$EXEC_FILE" = "./$BASE_NAME" ] || [ "$EXEC_FILE" = "$BASE_NAME" ]; then
        FULL_PATH=`pwd`
else
        FULL_PATH=`echo "$EXEC_FILE" | sed 's/'"${BASE_NAME}"'$//'`
        cd "$FULL_PATH"                 > /dev/null 2>&1
        FULL_PATH=`pwd`
fi

java -server \
-Duser.timezone=UTC \
-Dfile.encoding=UTF-8 \
-Dlog4j.configurationFile=file://$FULL_PATH/log4j2.xml \
-jar ./target/toyproject_fds-*.jar $PROP