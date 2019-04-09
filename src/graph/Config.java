package graph;

public class Config {
	public String jobName;
	public long sizeRowset;
	public int sleepTimeEmpty;
	public int sleepTimeFull;
	public boolean uniqueConnections;
	public boolean feedbackShown;
	public long feedbackSize;
	public long batchSize;
	public long fetchSize;
	public String executorMemory;
	public int cores;

	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public long getSizeRowset() {
		return sizeRowset;
	}
	public void setSizeRowset(long sizeRowset) {
		this.sizeRowset = sizeRowset;
	}
	public int getSleepTimeEmpty() {
		return sleepTimeEmpty;
	}
	public void setSleepTimeEmpty(int sleepTimeEmpty) {
		this.sleepTimeEmpty = sleepTimeEmpty;
	}
	public int getSleepTimeFull() {
		return sleepTimeFull;
	}
	public void setSleepTimeFull(int sleepTimeFull) {
		this.sleepTimeFull = sleepTimeFull;
	}
	public boolean isUniqueConnections() {
		return uniqueConnections;
	}
	public void setUniqueConnections(boolean uniqueConnections) {
		this.uniqueConnections = uniqueConnections;
	}
	public boolean isFeedbackShown() {
		return feedbackShown;
	}
	public void setFeedbackShown(boolean feedbackShown) {
		this.feedbackShown = feedbackShown;
	}
	public long getFeedbackSize() {
		return feedbackSize;
	}
	public void setFeedbackSize(long feedbackSize) {
		this.feedbackSize = feedbackSize;
	}
	public long getBatchSize() {
		return batchSize;
	}
	public void setBatchSize(long batchSize) {
		this.batchSize = batchSize;
	}
	public long getFetchSize() {
		return fetchSize;
	}
	public void setFetchSize(long fetchSize) {
		this.fetchSize = fetchSize;
	}
	public String getExecutorMemory() {
		return executorMemory;
	}
	public void setExecutorMemory(String executorMemory) {
		this.executorMemory = executorMemory;
	}
	public int getCores() {
		return cores;
	}
	public void setCores(int cores) {
		this.cores = cores;
	}

}
