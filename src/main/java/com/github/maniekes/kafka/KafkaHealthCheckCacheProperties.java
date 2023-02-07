package com.github.maniekes.kafka;

public class KafkaHealthCheckCacheProperties {

	private int maximumSize = 200;

	public int getMaximumSize() {
		return maximumSize;
	}

	public void setMaximumSize(int maximumSize) {
		this.maximumSize = maximumSize;
	}

	@Override
	public String toString() {
		return "CacheProperties{maximumSize=" + maximumSize + '}';
	}
}
