set projectLocation=
cd %projectLocaton%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testing.Test %projectLocation%\testing