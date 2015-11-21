package org.openbakery.stubs

import org.gradle.logging.ProgressLogger

/**
 * Created by rene on 30.06.15.
 */
class ProgressLoggerStub implements ProgressLogger {

	def progress = []

	@Override
	String getDescription() {
		return null
	}

	@Override
	ProgressLogger setDescription(String s) {
    return this
	}

	@Override
	String getShortDescription() {
		return null
	}

	@Override
	ProgressLogger setShortDescription(String s) {
    return this
	}

	@Override
	String getLoggingHeader() {
		return null
	}

	@Override
	ProgressLogger setLoggingHeader(String s) {
    return this
	}

	@Override
	ProgressLogger start(String s, String s1) {
		return this
	}

	@Override
	void started() {

	}

	@Override
	void started(String s) {

	}

	@Override
	void progress(String status) {
		progress << status
	}

	@Override
	void completed() {

	}

	@Override
	void completed(String s) {

	}
}
