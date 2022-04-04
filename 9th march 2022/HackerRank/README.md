# Revising the Select Query II

## Problem Statement :

- Query the NAME field for all American cities in the CITY table with populations larger than 120000. The CountryCode for America is USA.

- The CITY table is described as follows:

## CODE :-

SELECT name FROM city
WHERE
    COUNTRYCODE = 'USA'
    AND POPULATION > 120000;





