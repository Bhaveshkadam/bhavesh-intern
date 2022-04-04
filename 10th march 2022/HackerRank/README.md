# SQL

## Problem Statement : 


- Revising the Select Query I
	- Query all columns for all American cities in the CITY table with populations larger than 100000. The CountryCode for America is USA.

The CITY table is described as follows: 

## code : 

SELECT * FROM CITY
WHERE 
COUNTRYCODE = 'USA'
    AND POPULATION > 100000;


## link: 
 - https://www.hackerrank.com/challenges/revising-the-select-query/problem
