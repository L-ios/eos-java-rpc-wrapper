package client.domain.response.chain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import client.domain.response.chain.block.NewProducers;
import client.domain.response.history.transaction.Transaction;

import java.math.BigInteger;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Block {

    private String previous;

    private Date timeStamp;

    private String transactionMerkleRoot;

    private String actionMerkleRoot;

    private String blockMerkleRoot;

    private String producer;

    private BigInteger scheduleVersion;

    private NewProducers newProducers;

    private String producerSignature;

    private String id;

    private BigInteger blockNum;

    private BigInteger refBlockPrefix;

    private Boolean confirmed;

    private Transaction[] transactions;

    private String[] headerExtensions;

    private String[] blockExtensions;

    public Block() {
    }

    public String getActionMerkleRoot() {
        return actionMerkleRoot;
    }

    @JsonProperty("action_mroot")
    public void setActionMerkleRoot(String actionMerkleRoot) {
        this.actionMerkleRoot = actionMerkleRoot;
    }

    public String getBlockMerkleRoot() {
        return blockMerkleRoot;
    }

    @JsonProperty("block_mroot")
    public void setBlockMerkleRoot(String blockMerkleRoot) {
        this.blockMerkleRoot = blockMerkleRoot;
    }

    public String getPrevious() {
        return previous;
    }

    @JsonProperty("previous")
    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    @JsonProperty("timestamp")
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:mm:ss")
    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getTransactionMerkleRoot() {
        return transactionMerkleRoot;
    }

    @JsonProperty("transaction_mroot")
    public void setTransactionMerkleRoot(String transactionMerkleRoot) {
        this.transactionMerkleRoot = transactionMerkleRoot;
    }

    public String getProducer() {
        return producer;
    }

    @JsonProperty("producer")
    public void setProducer(String producer) {
        this.producer = producer;
    }


    public String getProducerSignature() {
        return producerSignature;
    }

    @JsonProperty("producer_signature")
    public void setProducerSignature(String producerSignature) {
        this.producerSignature = producerSignature;
    }

    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public BigInteger getBlockNum() {
        return blockNum;
    }

    @JsonProperty("block_num")
    public void setBlockNum(BigInteger blockNum) {
        this.blockNum = blockNum;
    }

    public BigInteger getRefBlockPrefix() {
        return refBlockPrefix;
    }

    @JsonProperty("ref_block_prefix")
    public void setRefBlockPrefix(BigInteger refBlockPrefix) {
        this.refBlockPrefix = refBlockPrefix;
    }

    public NewProducers getNewProducers() {
        return newProducers;
    }

    @JsonProperty("new_producers")
    public void setNewProducers(NewProducers newProducers) {
        this.newProducers = newProducers;
    }

    public BigInteger getScheduleVersion() {
        return scheduleVersion;
    }

    @JsonProperty("schedule_version")
    public void setScheduleVersion(BigInteger scheduleVersion) {
        this.scheduleVersion = scheduleVersion;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public void setTransactions(Transaction[] transactions) {
        this.transactions = transactions;
    }

    public String[] getHeaderExtensions() {
        return headerExtensions;
    }

    @JsonProperty("header_extensions")
    public void setHeaderExtensions(String[] headerExtensions) {
        this.headerExtensions = headerExtensions;
    }

    public String[] getBlockExtensions() {
        return blockExtensions;
    }

    @JsonProperty("block_extensions")
    public void setBlockExtensions(String[] blockExtensions) {
        this.blockExtensions = blockExtensions;
    }
}
