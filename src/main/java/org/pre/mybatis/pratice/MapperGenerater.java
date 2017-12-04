package org.pre.mybatis.pratice;

import java.util.Map;

import org.mybatis.tools.io.Resources;
import org.mybatis.tools.mapping.Configuration;
import org.mybatis.tools.mapping.Table;
import org.mybatis.tools.utility.ResourceUtility;

public class MapperGenerater {

	public static void main(String[] args) {
		try {
			String resource = "config.properties";
			Configuration configuration = Resources.getConfigurationAsProperties(resource);
			Map<String, Table> tableMetaData = Resources.getTableMetaDataAsConfiguration(configuration);
			new ResourceUtility().configuration(configuration).tableMetaData(tableMetaData).generate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
