package com.example.parsingjson.roomdatabase

import androidx.room.TypeConverter
import com.example.parsingjson.model.*
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class Converters {

    // Api object Converter
    @TypeConverter
    fun fromApiToJsonString( api:Api):String
    {
        return  Gson().toJson(api)
    }

    @TypeConverter
    fun fromJsonStringToApi(jsonString: String):Api
    {
        return Gson().fromJson(jsonString,Api::class.java)
    }

    // keysRequired List<String> Converter
    @TypeConverter
    fun fromKeysRequiredToJsonString( keysRequired:List<String>):String
    {
        return  Gson().toJson(keysRequired)
    }

    @TypeConverter
    fun fromJsonStringToKeysRequired(jsonString: String):List<String>
    {
        val typeToken = object : TypeToken<List<String>>() {}.type
        return Gson().fromJson(jsonString, typeToken)
    }


    // ApiX object Converter
    @TypeConverter
    fun fromApiXToJsonString( apiX: ApiX):String
    {
        return  Gson().toJson(apiX)
    }

    @TypeConverter
    fun fromJsonStringToApiX(jsonString: String):ApiX
    {
        return Gson().fromJson(jsonString,ApiX::class.java)
    }

    // Headers object Converter
    @TypeConverter
    fun fromHeadersToJsonString( headers: Headers):String
    {
        return  Gson().toJson(headers)
    }

    @TypeConverter
    fun fromJsonStringToHeaders(jsonString: String):Headers
    {
        return Gson().fromJson(jsonString,Headers::class.java)
    }

    // HeadersX object Converter
    @TypeConverter
    fun fromHeadersXToJsonString( headersX: HeadersX):String
    {
        return  Gson().toJson(headersX)
    }

    @TypeConverter
    fun fromJsonStringToHeadersX(jsonString: String):HeadersX
    {
        return Gson().fromJson(jsonString,HeadersX::class.java)
    }

    // X0 object Converter
    @TypeConverter
    fun fromX0ToJsonString(x0: X0):String
    {
        return  Gson().toJson(x0)
    }

    @TypeConverter
    fun fromJsonStringToX0(jsonString: String):X0
    {
        return Gson().fromJson(jsonString,X0::class.java)
    }

    // X1 object Converter
    @TypeConverter
    fun fromX1ToJsonString(x1: X1):String
    {
        return  Gson().toJson(x1)
    }

    @TypeConverter
    fun fromJsonStringToX1(jsonString: String):X1
    {
        return Gson().fromJson(jsonString,X1::class.java)
    }

    // keysRequired List<String> Converter
    @TypeConverter
    fun fromKeysRequiredAnyToJsonString( keysRequired:List<Any>):String
    {
        return  Gson().toJson(keysRequired)
    }

    @TypeConverter
    fun fromJsonStringToKeysRequiredAny(jsonString: String):List<Any>
    {
        val typeToken = object : TypeToken<List<Any>>() {}.type
        return Gson().fromJson(jsonString, typeToken)
    }

    // Action object Converter
    @TypeConverter
    fun fromActionToJsonString(action: Action):String
    {
        return  Gson().toJson(action)
    }

    @TypeConverter
    fun fromJsonStringToAction(jsonString: String):Action
    {
        return Gson().fromJson(jsonString,Action::class.java)
    }

    // List of Info object Converter
    @TypeConverter
    fun fromInfoToJsonString(info:List<Info>):String
    {
        return  Gson().toJson(info)
    }

    @TypeConverter
    fun fromJsonStringToInfo(jsonString: String):List<Info>
    {
        val typeToken=  object : TypeToken<List<Info>>() {}.type

        return Gson().fromJson(jsonString,typeToken)
    }

    // List of Step object converter
    @TypeConverter
    fun fromStepToJsonString(step: List<Step>):String
    {
      return Gson().toJson(step)
    }

    @TypeConverter
    fun fromJsonStringToStep(jsonString: String):List<Step>
    {
        val typeToken=  object : TypeToken<List<Step>>() {}.type

        return Gson().fromJson(jsonString,typeToken)
    }

    // Action object Converter
    @TypeConverter
    fun fromActionXToJsonString(actionX: ActionX):String
    {
        return  Gson().toJson( actionX)
    }

    @TypeConverter
    fun fromJsonStringToActionX(jsonString: String):ActionX
    {
        return Gson().fromJson(jsonString,ActionX::class.java)
    }

    // List of InfoX object Converter
    @TypeConverter
    fun fromInfoXToJsonString(infoX:List<InfoX>):String
    {
        return  Gson().toJson( infoX)
    }

    @TypeConverter
    fun fromJsonStringToInfoX(jsonString: String):List<InfoX>
    {
        val typeToken=  object : TypeToken<List<InfoX>>() {}.type

        return Gson().fromJson(jsonString,typeToken)
    }

    // List of StepX object converter
    @TypeConverter
    fun fromStepXToJsonString(stepX: List<StepX>):String
    {
        return Gson().toJson(stepX)
    }

    @TypeConverter
    fun fromJsonStringToStepX(jsonString: String):List<StepX>
    {
        val typeToken=  object : TypeToken<List<StepX>>() {}.type

        return Gson().fromJson(jsonString,typeToken)
    }



}