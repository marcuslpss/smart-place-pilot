package br.com.gwcloud.smartplace.pilot.utils;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public final class ResponseConverter {

	/**
	 * Converte o objeto herdado de {@link AbstractBaseDTO} para o formato JSON
	 * 
	 * @param dto - Objeto herdado de {@link AbstractBaseDTO}
	 * @return String - JSON gerado.
	 * @throws JsonProcessingException
	 */
	public static String toJSON(AbstractBaseDTO dto) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writeValueAsString(dto);
		return json;
	}

	/**
	 * Converte uma lista de objeto herdado de {@link AbstractBaseDTO} para o
	 * formato JSON
	 * 
	 * @param dtos - Lista contendo objetos herdado de {@link AbstractBaseDTO}
	 * @return String - JSON gerado.
	 * @throws JsonProcessingException
	 */
	public static String toJSON(List<?> dtos) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writeValueAsString(dtos);
		return json;
	}

	/**
	 * Converte o objeto herdado de {@link AbstractBaseDTO} para o formato XML
	 * 
	 * @param dto - Objeto herdado de {@link AbstractBaseDTO}
	 * @return String - XML gerada
	 * @throws JsonProcessingException
	 */
	public static String toXML(AbstractBaseDTO dto) throws JsonProcessingException {
		XmlMapper mapper = new XmlMapper();
		String xml = mapper.writeValueAsString(dto);
		return xml;
	}

	/**
	 * Converte uma lista de objeto herdado  para o
	 * formato XML
	 * 
	 * @param dtos -Lista de objetos
	 * @return String - XML gerada
	 * @throws JsonProcessingException
	 */
	public static String toXML(List<?> dtos) throws JsonProcessingException {
		XmlMapper mapper = new XmlMapper();
		String xml = mapper.writeValueAsString(dtos);
		return xml;
	}

}
