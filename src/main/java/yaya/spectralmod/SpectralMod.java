package yaya.spectralmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yaya.spectralmod.block.ModBlocks;
import yaya.spectralmod.item.ModItemGroups;
import yaya.spectralmod.item.ModItems;
import yaya.spectralmod.util.ModCustomTrades;
import yaya.spectralmod.world.gen.ModOreGeneration;

public class SpectralMod implements ModInitializer {
	public static final String MOD_ID = "spectralmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModCustomTrades.registerCustomTrades();
		
		// 注册矿石生成
		ModOreGeneration.generateOres(); // 已修复配置，重新开启
		
		LOGGER.info("光谱模组初始化完成！");
	}
}