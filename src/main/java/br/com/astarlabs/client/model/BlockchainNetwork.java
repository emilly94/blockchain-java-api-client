package br.com.astarlabs.client.model;

public enum BlockchainNetwork {

	//BITCOIN("bitcoin"),
	ETHEREUM("ethereum"),
	ETHEREUM_CLASSIC("ethereum-classic");

	private String name;

	public String getName() {
		return name;
	}

	BlockchainNetwork(String name) {
		this.name = name;
	}

}