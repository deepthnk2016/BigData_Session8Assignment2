/**
 * Session 8 Assignment 2
 * UDF Class function to join the contents of array based on the passed separator
 */
package com.acadgild;

import org.apache.hadoop.hive.ql.exec.UDF;

public class Session8Assignment2 extends UDF {
	public String evaluate(String sep, String[] arr) {

		String output = "";
		/* Concatenate the contents of the array by the separator; */
		output = String.join(sep, arr);
		/* Return the output */
		return output;
	}

}
