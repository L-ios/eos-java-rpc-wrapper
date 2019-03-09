package client.domain.response.chain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.math.BigInteger;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChainInfo {

    private String serverVersion;

    private String chainId;

    private BigInteger headBlockNum;

    private BigInteger lastIrreversibleBlockNum;

    private String lastIrreversibleBlockId;

    private String headBlockId;

    private Date headBlockTime;

    private String headBlockProducer;

    private BigInteger virtualBlockCpuLimit;

    private BigInteger virtualBlockNetLimit;

    private BigInteger blockCpuLimit;

    private BigInteger blockNetLimit;

    public ChainInfo() {

    }

    public String getServerVersion() {
        return serverVersion;
    }

    @JsonProperty("server_version")
    public void setServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
    }

    @JsonSetter("server_version_string")
    private void setServerVersionString(String serverVersion) {
        this.serverVersion = serverVersion;
    }

    public String getChainId() {
        return chainId;
    }

    @JsonProperty("chain_id")
    public void setChainId(String chainId) {
        this.chainId = chainId;
    }

    public BigInteger getHeadBlockNum() {
        return headBlockNum;
    }

    @JsonProperty("head_block_num")
    public void setHeadBlockNum(BigInteger headBlockNum) {
        this.headBlockNum = headBlockNum;
    }

    public BigInteger getLastIrreversibleBlockNum() {
        return lastIrreversibleBlockNum;
    }

    @JsonProperty("last_irreversible_block_num")
    public void setLastIrreversibleBlockNum(BigInteger lastIrreversibleBlockNum) {
        this.lastIrreversibleBlockNum = lastIrreversibleBlockNum;
    }

    public String getLastIrreversibleBlockId() {
        return lastIrreversibleBlockId;
    }

    @JsonProperty("last_irreversible_block_id")
    public void setLastIrreversibleBlockId(String lastIrreversibleBlockId) {
        this.lastIrreversibleBlockId = lastIrreversibleBlockId;
    }

    public String getHeadBlockId() {
        return headBlockId;
    }

    @JsonProperty("head_block_id")
    public void setHeadBlockId(String headBlockId) {
        this.headBlockId = headBlockId;
    }

    public Date getHeadBlockTime() {
        return headBlockTime;
    }

    @JsonProperty("head_block_time")
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:mm:ss")
    public void setHeadBlockTime(Date headBlockTime) {
        this.headBlockTime = headBlockTime;
    }

    public String getHeadBlockProducer() {
        return headBlockProducer;
    }

    @JsonProperty("head_block_producer")
    public void setHeadBlockProducer(String headBlockProducer) {
        this.headBlockProducer = headBlockProducer;
    }

    public BigInteger getVirtualBlockCpuLimit() {
        return virtualBlockCpuLimit;
    }

    @JsonProperty("virtual_block_cpu_limit")
    public void setVirtualBlockCpuLimit(BigInteger virtualBlockCpuLimit) {
        this.virtualBlockCpuLimit = virtualBlockCpuLimit;
    }

    public BigInteger getVirtualBlockNetLimit() {
        return virtualBlockNetLimit;
    }

    @JsonProperty("virtual_block_net_limit")
    public void setVirtualBlockNetLimit(BigInteger virtualBlockNetLimit) {
        this.virtualBlockNetLimit = virtualBlockNetLimit;
    }

    public BigInteger getBlockCpuLimit() {
        return blockCpuLimit;
    }

    @JsonProperty("block_cpu_limit")
    public void setBlockCpuLimit(BigInteger blockCpuLimit) {
        this.blockCpuLimit = blockCpuLimit;
    }

    public BigInteger getNetCpuLimit() {
        return blockNetLimit;
    }

    @JsonProperty("block_net_limit")
    public void setBlockNetLimit(BigInteger blockNetLimit) {
        this.blockNetLimit = blockNetLimit;
    }
}
