package client.domain.response.history.transaction;

import client.domain.common.ActionTrace;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Transaction {

    private String id;

    private Object trx;

    private Date blockTime;

    private BigInteger blockNum;

    private BigInteger lastIrreversibleBlock;

    private List<ActionTrace> traces = null;

    private String status;

    private BigInteger cpuUsage;

    private BigInteger netUsage;

    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Object getTrx() {
        return trx;
    }

    @JsonProperty("trx")
    public void setTrx(Object trx) {
        this.trx = trx;
    }

    public Date getBlockTime() {
        return blockTime;
    }

    @JsonProperty("block_time")
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:mm:ss")
    public void setBlockTime(Date blockTime) {
        this.blockTime = blockTime;
    }

    public BigInteger getBlockNum() {
        return blockNum;
    }

    @JsonProperty("block_num")
    public void setBlockNum(BigInteger blockNum) {
        this.blockNum = blockNum;
    }

    public BigInteger getLastIrreversibleBlock() {
        return lastIrreversibleBlock;
    }

    @JsonProperty("last_irreversible_block")
    public void setLastIrreversibleBlock(BigInteger lastIrreversibleBlock) {
        this.lastIrreversibleBlock = lastIrreversibleBlock;
    }

    public List<ActionTrace> getTraces() {
        return traces;
    }

    @JsonProperty("traces")
    public void setTraces(List<ActionTrace> traces) {
        this.traces = traces;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigInteger getCpuUsage() {
        return cpuUsage;
    }

    @JsonProperty("cpu_usage")
    public void setCpuUsage(BigInteger cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public BigInteger getNetUsage() {
        return netUsage;
    }

    @JsonProperty("net_usage")
    public void setNetUsage(BigInteger netUsage) {
        this.netUsage = netUsage;
    }
}
