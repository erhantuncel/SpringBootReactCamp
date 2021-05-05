package springreact.day4.hw3.concretes;

import springreact.day4.hw3.abstracts.CampaignService;
import springreact.day4.hw3.abstracts.Logger;
import springreact.day4.hw3.entities.Campaign;

public class CampaignManager implements CampaignService {

	Logger logger;

	public CampaignManager(Logger logger) {
		this.logger = logger;
	}

	@Override
	public void add(Campaign campaign) {
		logger.log("Campaign is added: " + campaign.toString());
	}

	@Override
	public void update(Campaign campaign) {
		logger.log("Campaign is updated: " + campaign.toString());
	}

	@Override
	public void delete(Campaign campaign) {
		logger.log("Campaign is removed: " + campaign.toString());
	}

}
